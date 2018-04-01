package frontController.account;

import analytics.Statistics;
import authentication.Authentication;
import entities.User;
import frontController.FrontCommand;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

public class LoginCommand extends FrontCommand {

    Authentication authentication = lookupAuthenticationBean();

    @Override
    public void process() {
        User user = authentication.login(request.getParameter("username"), 
                Base64.getEncoder().encodeToString(request.getParameter("password").getBytes()));
        
        if(user != null) {
            HttpSession session = request.getSession();
            
            int expireTime = 30*60;
            session.setAttribute("user", user);
            session.setMaxInactiveInterval(expireTime);
            
            Cookie cookieUser = new Cookie("user", user.getUsername());
            cookieUser.setMaxAge(expireTime);
            
            response.addCookie(cookieUser);
            
            Statistics.incrementLogins();
            redirect("/EscaladApp-war/mountains/index.jsp");
        } else {
            request.setAttribute("error", "*Usuario y contraseña incorrectos. Prueba otra vez.");
            forward("/account/login.jsp");
        }
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
