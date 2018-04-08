package stateful;

import entities.Mountain;
import java.util.HashMap;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;

@Stateful
@LocalBean
public class Route {
    public enum State {
        Pending,
        Visited
    }
    private HashMap<Mountain, State> mountains = new HashMap<>();
 
    public void addMountain(Mountain mountain) {
        if(!mountains.containsKey(mountain))
            mountains.put(mountain, State.Pending);
    }
    
    public void removeMountain(Mountain mountain) {
        if(mountains.containsKey(mountain))
            mountains.remove(mountain);
    }

    public HashMap<Mountain, State> getMountains() {
        return mountains;
    }
    
}
