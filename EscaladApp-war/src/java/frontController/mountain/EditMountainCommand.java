package frontController.mountain;

import entities.Mountain;
import frontController.FrontCommand;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import session.MountainFacade;
import util.UTF8;

public class EditMountainCommand extends FrontCommand {

    MountainFacade mountainFacade = lookupMountainFacadeBean();

    @Override
    public void process() {
        Mountain mountain = buildMountainFromRequest();
        
        mountainFacade.updateMountain(mountain);
        forward("/FrontServlet?command=mountain.ShowMountainCommand&id=" + mountain.getId());
    }
    
    private Mountain buildMountainFromRequest() {
        Mountain mountain = new Mountain();
        
        mountain.setId(Integer.parseInt(request.getParameter("id")));
        mountain.setName(UTF8.parse(request.getParameter("name")));
        mountain.setLocation(UTF8.parse(request.getParameter("location")));
        mountain.setAltitude(Float.valueOf(request.getParameter("altitude")));
        mountain.setImage(request.getParameter("image"));
        mountain.setDescription(UTF8.parse(request.getParameter("description")));
        
        return mountain;
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
