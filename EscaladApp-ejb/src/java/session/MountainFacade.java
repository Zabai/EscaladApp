package session;

import entities.Mountain;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MountainFacade extends AbstractFacade<Mountain> {
    public static int PAGE_SIZE = 9;

    @PersistenceContext(unitName = "EscaladApp-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MountainFacade() {
        super(Mountain.class);
    }
    
}
