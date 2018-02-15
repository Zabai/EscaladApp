package frontController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UnknownCommand extends FrontCommand {

    @Override
    public void process() {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Not Found</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>404 - Resource not found</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (IOException ex) {
            Logger.getLogger(PersonCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
