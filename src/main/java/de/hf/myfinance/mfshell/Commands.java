package de.hf.myfinance.mfshell;

import de.hf.framework.audit.AuditService;
import de.hf.framework.audit.Severity;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import de.hf.myfinance.event.Event;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import static de.hf.myfinance.event.Event.Type.START;

@ShellComponent
public class Commands {
    private final AuditService auditService;
    private final StreamBridge streamBridge;
    private final RabbitTemplate rabbitTemplate;
    protected static final String AUDIT_MSG_TYPE="MFShellApplication_Event";

    @Autowired
    public Commands(AuditService auditService, StreamBridge streamBridge, RabbitTemplate rabbitTemplate) {
        this.auditService = auditService;
        this.streamBridge = streamBridge;
        this.rabbitTemplate = rabbitTemplate;
    }

    @ShellMethod(value = "process recurrent transactions")
    public void processTransactions()
    {
        auditService.saveMessage("start process Transactions", Severity.INFO, AUDIT_MSG_TYPE);

        sendMessage("processRecurrentTransaction-out-0", new Event<>(START, "processRecurrentTransactions", null));

    }

    @ShellMethod(value = "start import marketdata")
    public void importMarketData()
    {
        auditService.saveMessage("start import marketdata", Severity.INFO, AUDIT_MSG_TYPE);
        sendMessage("loadNewMarketData-out-0", new Event<>(START, "loadNewMarketData", null));
    }

    /**
     * Since the sendMessage() uses blocking code, when calling streamBridge,
     * it has to be executed on a thread provided by a dedicated scheduler, publishEventScheduler
     */
    private boolean sendMessage(String bindingName, Event<String, Object> event) {
        Message<Event<String, Object>> message = MessageBuilder.withPayload(event)
                .setHeader("partitionKey", event.getKey())
                .build();
        return streamBridge.send(bindingName, message);
    }
}
