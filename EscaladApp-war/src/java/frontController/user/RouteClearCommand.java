package frontController.user;

import entities.User;
import frontController.FrontCommand;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import stateful.Route;

public class RouteClearCommand extends FrontCommand {

    Route route = lookupRouteBean();

    @Override
    public void process() {
        User user = (User) request.getSession().getAttribute("user");
        route = (Route) request.getSession().getAttribute("route");
        
        route.clearRoute();
        redirect("/EscaladApp-war/account/routes.jsp");
    }

    private Route lookupRouteBean() {
        try {
            Context c = new InitialContext();
            return (Route) c.lookup("java:global/EscaladApp/EscaladApp-ejb/Route!stateful.Route");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
