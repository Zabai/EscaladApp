package frontController;

import model.Mountain;
import persistence.MountainDB;
import util.UTF8;

public class EditMountain extends FrontCommand {

    @Override
    public void process() {
        Mountain mountain = buildMountainFromRequest();
        
        MountainDB.updateMountain(mountain);
        redirect("/mountains/show.jsp?id=" + request.getParameter("id"));
    }
    
    private Mountain buildMountainFromRequest() {
        Mountain mountain = new Mountain();
        
        mountain.setName(UTF8.parse(request.getParameter("name")));
        mountain.setLocation(UTF8.parse(request.getParameter("location")));
        mountain.setAltitude(Float.valueOf(request.getParameter("altitude")));
        mountain.setImage(request.getParameter("image"));
        mountain.setDescription(UTF8.parse(request.getParameter("description")));
        
        return mountain;
    }
    
}
