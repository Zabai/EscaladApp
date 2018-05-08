package session;

import entities.Statictics;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class StaticticsFacade extends AbstractFacade<Statictics> {

    @PersistenceContext(unitName = "EscaladApp-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StaticticsFacade() {
        super(Statictics.class);
    }
    
}
