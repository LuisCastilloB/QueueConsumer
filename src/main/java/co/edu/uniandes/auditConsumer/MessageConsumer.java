package co.edu.uniandes.auditConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    
        @Autowired
        private AuditService auditService;
        
	@JmsListener(destination = "audit")
	public void receiveMessage(String message) {
                System.out.println("Message read from de queue:" + message);
                processMessage(message);
	}
        
        public void processMessage(String log) {
            
            Audit audit = new Audit();
            audit.setMessage(log);
            auditService.save(audit);
            System.out.println("Log Saved in DB:" + log);
        }
}