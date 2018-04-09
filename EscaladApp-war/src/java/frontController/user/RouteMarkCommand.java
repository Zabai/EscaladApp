package frontController.user;

import entities.Mountain;
import entities.User;
import frontController.FrontCommand;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import session.MountainFacade;
import stateful.Route;

public class RouteMarkCommand extends FrontCommand {

    MountainFacade mountainFacade = lookupMountainFacadeBean();

    Route route = lookupRouteBean();

    @Override
    public void process() {
        int mountainId = Integer.parseInt(request.getParameter("id"));
        
        User user = (User) request.getSession().getAttribute("user");
        route = (Route) request.getSession().getAttribute("route");
        
        Mountain mountain = route.getMountainBy(mountainId);
        
        if(route.getMountains().get(mountain) == Route.State.Pendiente) {
            route.markMountainAsVisited(mountain);
        } else {
            route.markMountainAsPending(mountain);
        }
        
        request.getSession().setAttribute("route", route);
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
