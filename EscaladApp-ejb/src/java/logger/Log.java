package logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;

@Singleton
@LocalBean
public class Log {
    Logger logger;
    
    @PostConstruct
    private void init() {
        logger = Logger.getLogger(Log.class.getName());
        try {
            logger.addHandler(new FileHandler("log.txt"));
        } catch (IOException | SecurityException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Lock(LockType.WRITE)
    public void logInfo(String info) {
        logger.log(Level.INFO, info);
    }
}
