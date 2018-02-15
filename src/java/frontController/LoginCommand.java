package frontController;

import java.io.IOException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
import persistence.UserDB;

public class LoginCommand extends FrontCommand {

    @Override
    public void process() {
        User user = buildUserFromRequest();
        User target = UserDB.getUserByUsername(user.getUsername());
        
        
        
//        try {
//            if(user.getPassword().equals(target.getPassword()))
//                response.sendRedirect("/");
//            else
//                response.sendRedirect("/account/login.jsp");
//        } catch (IOException ex) {
//            Logger.getLogger(LoginCommand.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    private User buildUserFromRequest() {
        User user = new User();
        
        user.setUsername(request.getParameter("username"));
        user.setPassword(Base64.getEncoder().encodeToString(request.getParameter("password").getBytes()));
        
        return user;
    }
}
