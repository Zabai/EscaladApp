package frontController.mountain;

import entities.Mountain;
import frontController.FrontCommand;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import session.MountainFacade;

public class RemoveMountain extends FrontCommand {

    MountainFacade mountainFacade = lookupMountainFacadeBean();

    @Override
    public void process() {
        mountainFacade.deleteMountain(Integer.parseInt(request.getParameter("id")));
        redirect("/EscaladApp-war/mountains/index.jsp");
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