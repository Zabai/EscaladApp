package frontController;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistence.DB;

public class PersonCommand extends FrontCommand {

    @Override
    public void process() {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet example</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet example at " + request.getContextPath() + "</h1>");
            out.println("<h2>" + "Hola " + request.getParameter("name") + "</h2>");
            out.println("</body>");
            out.println("</html>");
        } catch (IOException ex) {
            Logger.getLogger(PersonCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
