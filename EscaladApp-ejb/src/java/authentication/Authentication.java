package authentication;

import entities.User;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityExistsException;
import session.UserFacade;

@Stateless
@LocalBean
public class Authentication {
    @EJB
    UserFacade userFacade;
    
    public boolean register(User user) {
        try {
            userFacade.create(user);
        } catch(EntityExistsException e) {
            return false;
        }
        return true;
    }
    
    public User login(String username, String password) {
        User user = userFacade.findByUsername(username);
        
        if(user != null && user.getPassword().equals(password))
            return user;
        else 
            return null;
    }
}
