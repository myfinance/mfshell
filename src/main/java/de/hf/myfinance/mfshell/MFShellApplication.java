package de.hf.myfinance.mfshell;

import de.hf.framework.audit.AuditService;
import de.hf.framework.audit.Severity;
import de.hf.myfinance.event.Event;
import de.hf.myfinance.restmodel.MarketDataImportType;

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

    public MFShellApplication(AuditService auditService, StreamBridge streamBridge) {
        this.auditService = auditService;
        this.streamBridge = streamBridge;
    }
    public static void main(String[] args) throws Exception {
        System.exit(SpringApplication.exit(SpringApplication.run(MFShellApplication.class, args)));
    }

    @Override
    public void run(String... args) {
        if(job.equals("importTimeseriesWeekly")) {
            importTimeseriesWeekly();
        } else if(job.equals("processTransactions")) {
            processTransactions();
        } else if(job.equals("importSecurityMetrics")) {
            importSecurityMetrics();
        } else if(job.equals("importPrevClose")) {
            importPrevClose();
        }

    }

    private void processTransactions()
    {
        auditService.saveMessage("start process Transactions", Severity.INFO, AUDIT_MSG_TYPE);

        Event<String, Object> event = new Event<>(START, "processRecurrentTransactions", null);
        Message<Event<String, Object>> message = MessageBuilder.withPayload(event)
                .setHeader("partitionKey", event.getKey())
                .build();
        streamBridge.send("processRecurrentTransaction-out-0", message);
    }

    private void importTimeseriesWeekly()
    {
        auditService.saveMessage("start import alphavantage prices", Severity.INFO, AUDIT_MSG_TYPE);
        Event<MarketDataImportType, Object> event = new Event<>(START, MarketDataImportType.TIME_SERIES_WEEKLY, "all");
        sendMessage("loadNewMarketData-out-0", event);
    }

    private void importSecurityMetrics()
    {
        auditService.saveMessage("start import marketdata", Severity.INFO, AUDIT_MSG_TYPE);
        Event<MarketDataImportType, Object> event = new Event<>(START, MarketDataImportType.SECURITYMETRICS, "all");
        sendMessage("loadNewMarketData-out-0", event);
    }

    private void importPrevClose()
    {
        auditService.saveMessage("start import marketdata", Severity.INFO, AUDIT_MSG_TYPE);
        Event<MarketDataImportType, Object> event = new Event<>(START, MarketDataImportType.PREV_CLOSE, "all");
        sendMessage("loadNewMarketData-out-0", event);
    }

    /**
     * Since the sendMessage() uses blocking code, when calling streamBridge,
     * it has to be executed on a thread provided by a dedicated scheduler, publishEventScheduler
     */
    private boolean sendMessage(String bindingName, Event<MarketDataImportType, Object> event) {
        Message<Event<MarketDataImportType, Object>> message = MessageBuilder.withPayload(event)
                .setHeader("partitionKey", event.getKey())
                .build();
        return streamBridge.send(bindingName, message);
    }
}
