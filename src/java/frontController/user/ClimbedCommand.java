package frontController.user;

import frontController.FrontCommand;
import helpers.UserHelper;
import model.Mountain;
import model.User;
import persistence.ClimbedDB;
import persistence.MountainDB;

public class ClimbedCommand extends FrontCommand {

    @Override
    public void process() {
        User user = (User) request.getSession().getAttribute("user");
        int mountainId = Integer.parseInt(request.getParameter("id"));
        
        if(UserHelper.userHasClimbedMountain(user, mountainId)) {
            Mountain found = user.getClimbed().parallelStream()
                    .filter(mountain -> mountain.getId()==mountainId)
                    .findFirst().get();
            user.getClimbed().remove(found);
            
            ClimbedDB.deleteClimbed(user.getId(), mountainId);
        } else {
            user.getClimbed().add(MountainDB.getById(mountainId));
            ClimbedDB.insertClimbed(user.getId(), mountainId);
        }
        
        redirect("/FrontServlet?command=mountain.ShowMountainCommand&id=" + request.getParameter("id"));
    }
    
}