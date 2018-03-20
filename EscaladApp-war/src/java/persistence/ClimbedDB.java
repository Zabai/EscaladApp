package persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClimbedDB {
    public static ArrayList<Integer> getByUserId(int id) {
        ArrayList<Integer> favourites = new ArrayList<>();
        
        DB db = new DB();
        try {
            db.setPreparedStatement(db.getConnection().prepareStatement("SELECT * FROM climbed WHERE user=?"));
            db.getPreparedStatement().setInt(1, id);
            
            ResultSet resultSet = db.getPreparedStatement().executeQuery();
            while(resultSet.next()) {
                favourites.add(resultSet.getInt("mountain"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FavouriteDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            db.close();
        }
        
        return favourites;
    }
    
    public static void insertClimbed(int userId, int mountainId) {
        DB db = new DB();
        try {
            db.setPreparedStatement(db.getConnection().prepareStatement("INSERT INTO climbed(user, mountain) VALUES (?, ?)"));
            db.getPreparedStatement().setInt(1, userId);
            db.getPreparedStatement().setInt(2, mountainId);
            
            db.getPreparedStatement().executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FavouriteDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            db.close();
        }
    }
    
    public static void deleteClimbed(int userId, int mountainId) {
        DB db = new DB();
        try {
            db.setPreparedStatement(db.getConnection().prepareStatement("DELETE FROM climbed WHERE user=? AND mountain=?"));
            db.getPreparedStatement().setInt(1, userId);
            db.getPreparedStatement().setInt(2, mountainId);
            
            db.getPreparedStatement().executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FavouriteDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            db.close();
        }
    }
}