package stateful;

import entities.Mountain;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;
import logger.Log;

@Stateful
@LocalBean
public class Route {
    @EJB
    private Log log;
    public enum State {
        Pendiente,
        Visitado
    }
    
    private HashMap<Mountain, State> mountains = new HashMap<>();
 
    public void addMountain(Mountain mountain) {
        mountains.put(mountain, State.Pendiente);
        Log.logBean(getClass().getSimpleName(), "addMountain");
    }
    
    public void removeMountain(Mountain mountain) {
        mountains.remove(mountain);
        Log.logBean(getClass().getSimpleName(), "removeMountain");
    }
    
    public void markMountainAsVisited(Mountain mountain) {
        mountains.put(mountain, State.Visitado);
        Log.logBean(getClass().getSimpleName(), "markMountainAsVisited");
    }
    
    public void markMountainAsPending(Mountain mountain) {
        mountains.put(mountain, State.Pendiente);
        Log.logBean(getClass().getSimpleName(), "markMountainAsPending");
    }
    
    public void clearRoute() {
        mountains.clear();
    }
    
    public Mountain getMountainBy(int id) {
        Mountain mountain = null;
        
        for (Map.Entry<Mountain, State> entry : mountains.entrySet()) {
            if(entry.getKey().getId() == id) mountain = entry.getKey();
        }
        
        Log.logBean(getClass().getSimpleName(), "getMountainBy");
        return mountain;
    }

    public HashMap<Mountain, State> getMountains() {
        Log.logBean(getClass().getSimpleName(), "getMountains");
        return mountains;
    }
    
    public int countMountainsPending() {
        Log.logBean(getClass().getSimpleName(), "countMountainsPending");
        return Collections.frequency(mountains.values(), State.Pendiente);
    }
    
    public int countMountainsVisited() {
        Log.logBean(getClass().getSimpleName(), "countMountainsVisited");
        return Collections.frequency(mountains.values(), State.Visitado);
    }
}
