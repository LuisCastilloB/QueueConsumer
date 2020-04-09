
package co.edu.uniandes.auditConsumer;

import org.springframework.beans.factory.annotation.Autowired;

public class DataProcess {
    
  //  @Autowired
   // private AuditService auditService;
    
    public boolean insert(String log){
       /* Audit audit = new Audit();
        audit.setMessage(log);
        auditService.save(audit);*/
        return true;
    }
}
