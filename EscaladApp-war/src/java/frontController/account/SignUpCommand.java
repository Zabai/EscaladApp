package frontController.account;

import frontController.FrontCommand;
import java.util.Base64;
import java.util.Date;
import model.User;
import persistence.UserDB;

public class SignUpCommand extends FrontCommand {

    @Override
    public void process() {
        User user = new User();
        buildUserFromRequest(user);
        
        UserDB.insertUser(user);
        redirect("/EscaladApp-war/account/login.jsp");
    }
    
    private User buildUserFromRequest(User user) {
        user.setUsername(request.getParameter("username"));
        user.setPassword(Base64.getEncoder().encodeToString(request.getParameter("password").getBytes()));
        user.setEmail(request.getParameter("email"));
        user.setCreationDate(new Date());
        
        return user;
    }

}
