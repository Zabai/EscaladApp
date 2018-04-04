package frontController.account;

import authentication.Authentication;
import entities.User;
import frontController.FrontCommand;
import java.util.Base64;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class SignUpCommand extends FrontCommand {

    Authentication authentication = lookupAuthenticationBean();

    @Override
    public void process() {
        User user = new User();
        buildUserFromRequest(user);
        
        authentication.register(user);
        redirect("/EscaladApp-war/account/login.jsp");
    }
    
    private User buildUserFromRequest(User user) {
        user.setUsername(request.getParameter("username"));
        user.setPassword(Base64.getEncoder().encodeToString(request.getParameter("password").getBytes()));
        user.setEmail(request.getParameter("email"));
        user.setCreationDate(new Date());
        
        return user;
    }

    private Authentication lookupAuthenticationBean() {
        try {
            Context c = new InitialContext();
            return (Authentication) c.lookup("java:global/EscaladApp/EscaladApp-ejb/Authentication!authentication.Authentication");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
