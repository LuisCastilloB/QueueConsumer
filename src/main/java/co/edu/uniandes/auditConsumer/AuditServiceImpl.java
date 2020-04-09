package co.edu.uniandes.auditConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuditServiceImpl implements AuditService{
    
    @Autowired
    private AuditDAO auditDAO;
    
    @Override
    @Transactional
    public void save(Audit audit) {
        auditDAO.save(audit);
    }    
}
