package frontController.mountain;

import frontController.FrontCommand;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import model.Mountain;
import persistence.MountainDB;

public class GetMountainsByPageCommand extends FrontCommand {

    @Override
    public void process() {
        //ArrayList<Mountain> mountains = MountainDB.getAllMountains();
        System.out.println("Página: " + request.getParameter("page"));
        String param = request.getParameter("command");
        
        context.setAttribute("test", "test");
        forward("/mountains/show.jsp");
    }
    
}