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
    
    
    public int getVisists() {
        return Integer.parseInt(((Statictics) em.createQuery("SELECT s FROM Statictics s WHERE s.field='visits'").getSingleResult()).getValue());
    }
    
    public int getLogins() {
        return Integer.parseInt(((Statictics) em.createQuery("SELECT s FROM Statictics s WHERE s.field='logins'").getSingleResult()).getValue());
    }
    
    public void updateVisits(int visists) {
        em.createQuery("UPDATE Statictics SET value=:visits WHERE field='visits'")
                .setParameter("visits", String.valueOf(visists))
                .executeUpdate();
    }
    
    public void updateLogins(int logins) {
        em.createQuery("UPDATE Statictics SET value=:logins WHERE field='logins'")
                .setParameter("logins", String.valueOf(logins))
                .executeUpdate();
    }
}
