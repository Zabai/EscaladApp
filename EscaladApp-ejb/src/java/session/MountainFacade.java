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
    
    public void createMountain(Mountain mountain) {
        em.createNativeQuery("INSERT INTO mountains(name, altitude, location, image, description) "
                + "VALUES (?, ?, ?, ?, ?)")
                .setParameter(1, mountain.getName())
                .setParameter(2, mountain.getAltitude())
                .setParameter(3, mountain.getLocation())
                .setParameter(4, mountain.getImage())
                .setParameter(5, mountain.getDescription())
                .executeUpdate();
    }
    
    public List<Mountain> getMountains() {
        return em.createQuery("SELECT m FROM Mountain m ORDER BY m.name ASC").getResultList();
    }
    
    public void updateMountain(Mountain mountain) {
        em.createQuery("UPDATE Mountain "
                + "SET name=:name, altitude=:altitude, location=:location, image=:image, description=:description "
                + "WHERE id=:id")
                .setParameter("name", mountain.getName())
                .setParameter("altitude", mountain.getAltitude())
                .setParameter("location", mountain.getLocation())
                .setParameter("image", mountain.getImage())
                .setParameter("description", mountain.getDescription())
                .setParameter("id", mountain.getId())
                .executeUpdate();
    }
    
    public void deleteMountain(int mountainId) {
        em.createQuery("DELETE FROM Mountain m WHERE m.id=:id")
                .setParameter("id", mountainId)
                .executeUpdate();
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
