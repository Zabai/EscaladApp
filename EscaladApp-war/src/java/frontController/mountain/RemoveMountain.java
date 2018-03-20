package frontController.mountain;

import frontController.FrontCommand;
import model.Mountain;
import persistence.MountainDB;

public class RemoveMountain extends FrontCommand {

    @Override
    public void process() {
        Mountain mountain = MountainDB.getById(Integer.parseInt(request.getParameter("id")));
        
        if(mountain != null) {
           MountainDB.deleteMountain(mountain);
        }
        
        redirect("/EscaladApp-war/mountains/index.jsp");
    }
    
}