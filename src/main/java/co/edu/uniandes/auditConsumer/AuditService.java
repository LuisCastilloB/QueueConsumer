
package co.edu.uniandes.auditConsumer;

import org.springframework.stereotype.Service;

@Service
public interface AuditService {
    
    public void save(Audit audit);
}
