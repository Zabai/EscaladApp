package frontController;

import model.Mountain;
import model.User;
import persistence.MountainDB;

public class FavouriteCommand extends FrontCommand {

    @Override
    public void process() {
        User user = (User) request.getSession().getAttribute("user");
        Mountain mountain = MountainDB.getById(Integer.parseInt(request.getParameter("id")));
        
        if(user.getFavourites().contains(mountain))
            removeFromFavourites(user, mountain);
        else
            addToFavourites(user, mountain);
        
        redirect("/mountains/" + request.getParameter("id"));
    }

    private void addToFavourites(User user, Mountain mountain) {
        user.getFavourites().add(mountain);
        //TODO BD Stuff
    }

    private void removeFromFavourites(User user, Mountain mountain) {
        user.getFavourites().remove(mountain);
        //TODO BD Stuff
    }
    
}
