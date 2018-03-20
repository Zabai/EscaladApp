package frontController.account;

import frontController.FrontCommand;
import java.util.Base64;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import model.User;
import persistence.UserDB;

public class LoginCommand extends FrontCommand {

    @Override
    public void process() {
        User user = buildUserFromRequest();
        User target = UserDB.getByUsername(user.getUsername());
        
        if(isCorrectPassword(user.getPassword(), target.getPassword())) {
            HttpSession session = request.getSession();
            
            int expireTime = 30*60;
            session.setAttribute("user", target);
            session.setMaxInactiveInterval(expireTime);
            
            Cookie cookieUser = new Cookie("user", user.getUsername());
            cookieUser.setMaxAge(expireTime);
            
            response.addCookie(cookieUser);
            
            redirect("/EscaladApp-war/mountains/index.jsp");
        } else {
            request.setAttribute("error", "*Usuario y contraseña incorrectos. Prueba otra vez.");
            forward("/account/login.jsp");
        }
    }

    private User buildUserFromRequest() {
        User user = new User();
        
        user.setUsername(request.getParameter("username"));
        user.setPassword(Base64.getEncoder().encodeToString(request.getParameter("password").getBytes()));
        
        return user;
    }

    private boolean isCorrectPassword(String inputPassword, String userPassword) {
        return inputPassword.equals(userPassword);
    }

}
