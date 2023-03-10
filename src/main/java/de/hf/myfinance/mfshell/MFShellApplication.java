package de.hf.myfinance.mfshell;

import de.hf.framework.audit.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("de.hf")
public class MFShellApplication {

    private final AuditService auditService;
    protected static final String AUDIT_MSG_TYPE="MFShellApplication_Event";

    @Autowired
    public MFShellApplication(AuditService auditService) {
        this.auditService = auditService;
    }
    public static void main(String[] args) throws Exception {
        System.exit(SpringApplication.exit(SpringApplication.run(MFShellApplication.class, args)));
    }
}
