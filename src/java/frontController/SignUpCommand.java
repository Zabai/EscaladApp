package frontController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
import persistence.UserDB;

public class SignUpCommand extends FrontCommand {

    @Override
    public void process() {
        //response.sendRedirect("/");
        /*response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet example</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet example at " + request.getContextPath() + "</h1>");

            String data = request.getParameter("username") + " - "
                    + request.getParameter("email") + " - "
                    + request.getParameter("password") + " = " + request.getParameter("passwordRepeat");
            out.println("<h2>" + "Datos " + data + "</h2>");

            out.println("</body>");
            out.println("</html>");
        } catch (IOException ex) {
            Logger.getLogger(PersonCommand.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        User user = new User();
        buildUserFromRequest(user);
        
        UserDB.insertUser(user);
        try {
            response.sendRedirect("/");
        } catch (IOException ex) {
            Logger.getLogger(SignUpCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private User buildUserFromRequest(User user) {
        user.setUsername(request.getParameter("username"));
        user.setPassword(Base64.getEncoder().encodeToString(request.getParameter("password").getBytes()));
        user.setEmail(request.getParameter("email"));
        user.setCreationDate(new Date());
        
        return user;
    }

}
