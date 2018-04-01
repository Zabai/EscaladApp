package session;

import entities.Favourite;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class FavouriteFacade extends AbstractFacade<Favourite> {

    @PersistenceContext(unitName = "EscaladApp-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FavouriteFacade() {
        super(Favourite.class);
    }
    
}
