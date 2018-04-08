package logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
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
public class Log {

    static Logger logger;
    private FileHandler fileHandler;
    private static final String logPath = "C:\\Users\\zbrma\\Documents\\Web Projects\\EscaladApp\\log\\my-log.log";

    @PostConstruct
    private void init() {
        logger = Logger.getLogger(Log.class.getName());
        for (Handler handler : logger.getHandlers()) {  logger.removeHandler(handler);}
        
        try {
            fileHandler = new FileHandler(logPath);
            logger.addHandler(fileHandler);
        } catch (IOException | SecurityException ex) {
            logger.severe(ex.getMessage());
        }
    }

    @Schedule(hour = "*", minute = "*", second = "*/5")
    private void logTime() {
    }

    @Lock(LockType.WRITE)
    public static void logCommand(Class className) {
        logger.log(Level.INFO, "Command: {0}", new Object[]{className.getSimpleName()});
    }

    @Lock(LockType.WRITE)
    public static void logJsp(String url) {
        logger.log(Level.INFO, "JSP: {0}", url);
    }

    @Lock(LockType.WRITE)
    public static void logBean() {
    }

    @Lock(LockType.READ)
    public static String readLoag() {
        String log = "";
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(logPath));
            String line = reader.readLine();
            while (line != null) {
                if(line.contains("JSP:") || line.contains("Command:"))
                    log += line + "<br>";
                line = reader.readLine();
            }
        } catch (IOException ex) {
            logger.log(Level.SEVERE, null, ex);
        }

        return log;
    }
}
