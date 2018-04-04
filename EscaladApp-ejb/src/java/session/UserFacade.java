package session;

import entities.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class UserFacade extends AbstractFacade<User> {

    @PersistenceContext(unitName = "EscaladApp-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }
    
    public User findByUsername(String username) {
        Query query = em.createNamedQuery("User.findByUsername");
        query.setParameter("username", username);
        
        User user;
        try {
            user = (User) query.getSingleResult();
        } catch(NoResultException exception) {
            user = null;
        }
        
        return user;
    }
    
}
