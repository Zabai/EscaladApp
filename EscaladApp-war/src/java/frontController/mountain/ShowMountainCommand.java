package frontController.mountain;

import entities.Mountain;
import frontController.FrontCommand;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import session.MountainFacade;

public class ShowMountainCommand extends FrontCommand {

    MountainFacade mountainFacade = lookupMountainFacadeBean();

    @Override
    public void process() {
        Mountain mountain = mountainFacade.
                find(Integer.parseInt(request.getParameter("id")));
        if(mountain == null) mountain = new Mountain();
        
        request.setAttribute("mountain", mountain);
        forward("/mountains/show.jsp");
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