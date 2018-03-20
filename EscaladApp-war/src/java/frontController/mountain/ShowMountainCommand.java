package frontController.mountain;

import frontController.FrontCommand;
import model.Mountain;
import persistence.MountainDB;

public class ShowMountainCommand extends FrontCommand {

    @Override
    public void process() {
        Mountain mountain = MountainDB.getById(Integer.parseInt(request.getParameter("id")));
        if(mountain == null) mountain = new Mountain();
        
        request.setAttribute("mountain", mountain);
        
        forward("/mountains/show.jsp");
    }
    
}