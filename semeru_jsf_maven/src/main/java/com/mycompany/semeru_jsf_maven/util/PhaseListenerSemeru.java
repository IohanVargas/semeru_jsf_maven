
package com.mycompany.semeru_jsf_maven.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import org.hibernate.Session;

/**
 *
 * @author iohan
 */
public class PhaseListenerSemeru implements PhaseListener{
    //antes da face
    @Override
    public void afterPhase(PhaseEvent fase) {
        if (fase.getPhaseId().equals(PhaseId.RENDER_RESPONSE)){
             System.out.println("Depois da fase: " + getPhaseId());
            Session session = FacesContextUtil.getRequestSession();
            try {
                session.getTransaction().commit();
            } catch (Exception e) {
                if (session.getTransaction().isActive()){
                    session.getTransaction().rollback();
                }
            } finally {
                session.close();
            }
        }
    }

    //depois da fase
    @Override
    public void beforePhase(PhaseEvent fase) {
        if (fase.getPhaseId().equals(PhaseId.RESTORE_VIEW)){
            System.out.println("Antes da fase: " + getPhaseId());
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            FacesContextUtil.setRequestSession(session);
          
        }
    }

    
    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
    
    
    
    
}