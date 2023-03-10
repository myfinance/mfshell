package de.hf.myfinance.mfshell;

import de.hf.framework.audit.AuditService;
import de.hf.framework.audit.Severity;
import de.hf.myfinance.event.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import static de.hf.myfinance.event.Event.Type.START;

@SpringBootApplication
@ComponentScan("de.hf")
public class MFShellApplication implements CommandLineRunner {

    private final AuditService auditService;
    private final StreamBridge streamBridge;
    protected static final String AUDIT_MSG_TYPE="MFShellApplication_Event";

    @Value("${job.name}")         String job;

    @Autowired
    public MFShellApplication(AuditService auditService, StreamBridge streamBridge) {
        this.auditService = auditService;
        this.streamBridge = streamBridge;
    }
    public static void main(String[] args) throws Exception {
        System.exit(SpringApplication.exit(SpringApplication.run(MFShellApplication.class, args)));
    }

    @Override
    public void run(String... args) {
        if(job.equals("importMarketData")) {
            importMarketData();
        } else if(job.equals("processTransactions")) {
            processTransactions();
        }

    }

    private void processTransactions()
    {
        auditService.saveMessage("start process Transactions", Severity.INFO, AUDIT_MSG_TYPE);

        sendMessage("processRecurrentTransaction-out-0", new Event<>(START, "processRecurrentTransactions", null));

    }

    private void importMarketData()
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
