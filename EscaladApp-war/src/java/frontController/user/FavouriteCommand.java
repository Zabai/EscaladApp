package frontController.user;

import entities.Favourite;
import entities.User;
import frontController.FrontCommand;
import helpers.UserHelper;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import session.FavouriteFacade;
import session.MountainFacade;

public class FavouriteCommand extends FrontCommand {

    MountainFacade mountainFacade = lookupMountainFacadeBean();

    FavouriteFacade favouriteFacade = lookupFavouriteFacadeBean();

    @Override
    public void process() {
        User user = (User) request.getSession().getAttribute("user");
        int mountainId = Integer.parseInt(request.getParameter("id"));
        
        if(UserHelper.userHasFavouriteMountain(user, mountainId)) {
            Favourite found = user.getFavouriteList().parallelStream()
                    .filter(climbed -> climbed.getMountain().getId()==mountainId)
                    .findFirst().get();
            user.getFavouriteList().remove(found);
            
            favouriteFacade.remove(found);
        } else {
            Favourite favourite = new Favourite();
            favourite.setUser(user);
            favourite.setMountain(mountainFacade.find(mountainId));
            
            user.getFavouriteList().add(favourite);
            
            favouriteFacade.create(favourite);
        }
        
        redirect("/EscaladApp-war/FrontServlet?command=mountain.ShowMountainCommand&id=" + request.getParameter("id"));
    }

    private FavouriteFacade lookupFavouriteFacadeBean() {
        try {
            Context c = new InitialContext();
            return (FavouriteFacade) c.lookup("java:global/EscaladApp/EscaladApp-ejb/FavouriteFacade!session.FavouriteFacade");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    private MountainFacade lookupMountainFacadeBean() {
        try {
            Context c = new InitialContext();
            return (MountainFacade) c.lookup("java:global/EscaladApp/EscaladApp-ejb/MountainFacade!session.MountainFacade");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}