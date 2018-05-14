package frontController.criteria;

import frontController.FrontCommand;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import session.MountainFacade;

public class ShowCriteriaCommand extends FrontCommand {

    MountainFacade mountainFacade = lookupMountainFacadeBean();

    @Override
    public void process() {
        String order = request.getParameter("order");
        if (order != null) {
            switch (order) {
                case "asc":
                    request.setAttribute("mountains", mountainFacade.getMountainsByHeightAsc());
                    break;
                case "desc":
                    request.setAttribute("mountains", mountainFacade.getMountainsByHeightDesc());
                    break;
                case "name":
                    request.setAttribute("mountains", mountainFacade.getMountainsOrderAlphabetically());
                    break;
                default:
                    request.setAttribute("mountains", mountainFacade.getMountainsByHeightDesc());
                    break;
            }
        } else {
            request.setAttribute("mountains", mountainFacade.getMountainsByHeightDesc());
        }
        
        forward("/criteria/index.jsp");
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
