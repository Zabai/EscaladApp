package analytics;

import java.util.HashMap;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;

@Singleton
@LocalBean
public class Statistics {
    int visits, logins;
    HashMap<String, Integer> pages, components;
    
    @PostConstruct
    private void init() {
        // RETRIEVE FROM DB
    }
    
    @Lock(LockType.WRITE)
    public void registerPage(String page) {
        if(pages.containsKey(page))
            pages.put(page, pages.get(page) + 1);
        else
            pages.put(page, 1);
    }
    
    @Lock(LockType.WRITE)
    public void registerComponent(String component) {
        if(components.containsKey(component))
            components.put(component, components.get(component) + 1);
        else
            components.put(component, 1);
    }
    
    @Lock(LockType.WRITE)
    public void incrementVisits() {
        visits++;
    }
    
    @Lock(LockType.WRITE)
    public void incrementLogins() {
        logins++;
    }
    
    @Lock(LockType.READ)
    public int getVisits() {
        return visits;
    }
    
    @Lock(LockType.READ)
    public int getLogins() {
        return logins;
    }
    
    @Lock(LockType.READ)
    public HashMap<String, Integer> getPagesCalls() {
        return pages;
    }
    
    @Lock(LockType.READ)
    public HashMap<String, Integer> getComponentsCalls() {
        return components;
    }
}
