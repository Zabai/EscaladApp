package session;

import entities.Mountain;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
    
    public List<Mountain> getMountainsByHeightDesc() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        
        CriteriaQuery<Mountain> q = cb.createQuery(Mountain.class);
        Root<Mountain> c = q.from(Mountain.class);
        q.select(c);
        q.orderBy(cb.desc(c.get("altitude")));
        
        return em.createQuery(q).getResultList();
    }
    
    public List<Mountain> getMountainsByHeightAsc() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        
        CriteriaQuery<Mountain> q = cb.createQuery(Mountain.class);
        Root<Mountain> c = q.from(Mountain.class);
        q.select(c);
        q.orderBy(cb.asc(c.get("altitude")));
        
        return em.createQuery(q).getResultList();
    }
    
    public List<Mountain> getMountainsOrderAlphabetically() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        
        CriteriaQuery<Mountain> q = cb.createQuery(Mountain.class);
        Root<Mountain> c = q.from(Mountain.class);
        q.select(c);
        q.orderBy(cb.asc(c.get("name")));
        
        return em.createQuery(q).getResultList();
    }
    
}
