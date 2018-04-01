package session;

import entities.Climbed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ClimbedFacade extends AbstractFacade<Climbed> {

    @PersistenceContext(unitName = "EscaladApp-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClimbedFacade() {
        super(Climbed.class);
    }
    
}
