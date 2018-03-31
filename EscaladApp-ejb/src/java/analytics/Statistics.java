package analytics;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Schedule;
import javax.ejb.Startup;

@Singleton
@Startup
@LocalBean
public class Statistics {
    private static int visits, logins;
    private static HashMap<String, Integer> pagesVisits, componentsCalls;
    private transient String filePath = "C:\\Users\\zbrma\\Documents\\Web Projects\\EscaladApp\\log\\statistics.json";

    @PostConstruct
    private void init() {
        visits = 0;
        logins = 0;
        pagesVisits = new HashMap<>();
        componentsCalls = new HashMap<>();
    }

    @Schedule(hour = "*", minute = "*", second = "*/5")
    private void saveToFile() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(java.lang.reflect.Modifier.TRANSIENT);
        
        Gson gson = gsonBuilder.create();
        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(this, writer);
        } catch (IOException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Lock(LockType.WRITE)
    public static void incrementPageVisits(String page) {
        if (pagesVisits.containsKey(page)) {
            pagesVisits.put(page, pagesVisits.get(page) + 1);
        } else {
            pagesVisits.put(page, 1);
        }
    }

    @Lock(LockType.WRITE)
    public static void incrementComponentCalls(String component) {
        if (componentsCalls.containsKey(component)) {
            componentsCalls.put(component, componentsCalls.get(component) + 1);
        } else {
            componentsCalls.put(component, 1);
        }
    }

    @Lock(LockType.WRITE)
    public static void incrementVisits() {
        visits++;
    }

    @Lock(LockType.WRITE)
    public static void incrementLogins() {
        logins++;
    }

    @Lock(LockType.READ)
    public static int getVisits() {
        return visits;
    }

    @Lock(LockType.READ)
    public static int getLogins() {
        return logins;
    }

    @Lock(LockType.READ)
    public static HashMap<String, Integer> getPagesVisits() {
        return new HashMap<>(pagesVisits);
    }

    @Lock(LockType.READ)
    public static HashMap<String, Integer> getComponentsCalls() {
        return new HashMap<>(componentsCalls);
    }
}
