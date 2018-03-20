package frontController.user;

import frontController.FrontCommand;
import helpers.UserHelper;
import model.Mountain;
import model.User;
import persistence.FavouriteDB;
import persistence.MountainDB;

public class FavouriteCommand extends FrontCommand {

    @Override
    public void process() {
        User user = (User) request.getSession().getAttribute("user");
        int mountainId = Integer.parseInt(request.getParameter("id"));
        
        if(UserHelper.userHasFavouriteMountain(user, mountainId)) {
            Mountain found = user.getFavourites().parallelStream()
                    .filter(mountain -> mountain.getId()==mountainId)
                    .findFirst().get();
            user.getFavourites().remove(found);
            
            FavouriteDB.deleteFavourite(user.getId(), mountainId);
        } else {
            user.getFavourites().add(MountainDB.getById(mountainId));
            
            FavouriteDB.insertFavourite(user.getId(), mountainId);
        }
        
        redirect("/EscaladApp-war/FrontServlet?command=mountain.ShowMountainCommand&id=" + request.getParameter("id"));
    }
    
}