package frontController;

import model.Mountain;
import model.User;
import persistence.MountainDB;

public class ClimbedCommand extends FrontCommand {

    @Override
    public void process() {
        User user = (User) request.getSession().getAttribute("user");
        Mountain mountain = MountainDB.getById(Integer.parseInt(request.getParameter("id")));
        
        if(user.getClimbed().contains(mountain))
            removeFromClimbed(user, mountain);
        else
            addToClimbed(user, mountain);
        
        redirect("/mountains/show.jsp?id=" + request.getParameter("id"));
    }

    private void addToClimbed(User user, Mountain mountain) {
        user.getClimbed().add(mountain);
        // TODO BD Stuff
    }

    private void removeFromClimbed(User user, Mountain mountain) {
        user.getClimbed().remove(mountain);
        // TODO BD Stuff
    }
    
}
