package frontController.user;

import entities.Climbed;
import entities.User;
import frontController.FrontCommand;
import helpers.UserHelper;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import session.ClimbedFacade;
import session.MountainFacade;

public class ClimbedCommand extends FrontCommand {

    MountainFacade mountainFacade = lookupMountainFacadeBean();

    ClimbedFacade climbedFacade = lookupClimbedFacadeBean();

    @Override
    public void process() {
        User user = (User) request.getSession().getAttribute("user");
        int mountainId = Integer.parseInt(request.getParameter("id"));
        
        if(UserHelper.userHasClimbedMountain(user, mountainId)) {
            Climbed found = user.getClimbedList().parallelStream()
                    .filter(climbed -> climbed.getMountain().getId()==mountainId)
                    .findFirst().get();
            user.getClimbedList().remove(found);
            
            climbedFacade.remove(found);
        } else {
            Climbed climbed = new Climbed();
            climbed.setUser(user);
            climbed.setMountain(mountainFacade.find(mountainId));
            
            user.getClimbedList().add(climbed);
            
            climbedFacade.create(climbed);
        }
        
        redirect("/EscaladApp-war/FrontServlet?command=mountain.ShowMountainCommand&id=" + request.getParameter("id"));
    }

    private ClimbedFacade lookupClimbedFacadeBean() {
        try {
            Context c = new InitialContext();
            return (ClimbedFacade) c.lookup("java:global/EscaladApp/EscaladApp-ejb/ClimbedFacade!session.ClimbedFacade");
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