package persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Mountain;

public class MountainDB {
    public static Mountain getById(int id) {
        Mountain mountain = new Mountain();
        
        DB db = new DB();
        try {
            db.setPreparedStatement(db.getConnection().prepareStatement("SELECT * FROM mountains WHERE id=?"));
            db.getPreparedStatement().setInt(1, id);
            
            ResultSet resultSet = db.getPreparedStatement().executeQuery();
            while(resultSet.next()) {
                mountain.setId(resultSet.getInt("id"));
                mountain.setName(resultSet.getString("name"));
                mountain.setLocation(resultSet.getString("location"));
                mountain.setAltitude(resultSet.getFloat("altitude"));
                mountain.setImage(resultSet.getString("image"));
                mountain.setDescription(resultSet.getString("description"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.close();
        
        return mountain;
    }
    
    public static void insertMountain(Mountain mountain) {
        DB db = new DB();
        
        try {
            db.setPreparedStatement(db.getConnection()
                    .prepareStatement("INSERT INTO mountains(name, location, altitude, image, description) VALUES (?, ?, ?, ?, ?)"));
            db.getPreparedStatement().setString(1, mountain.getName());
            db.getPreparedStatement().setString(2, mountain.getLocation());
            db.getPreparedStatement().setFloat(3, mountain.getAltitude());
            db.getPreparedStatement().setString(4, mountain.getImage());
            db.getPreparedStatement().setString(5, mountain.getDescription());
            
            db.getPreparedStatement().executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        db.close();
    }

    public static void updateMountain(Mountain mountain) {
        DB db = new DB();
        
        try {
            db.setPreparedStatement(db.getConnection()
                    .prepareStatement("UPDATE mountains SET name=?, location=?, altitude=?, image=?, description=? "
                            + "WHERE id=?"));
            db.getPreparedStatement().setString(1, mountain.getName());
            db.getPreparedStatement().setString(2, mountain.getLocation());
            db.getPreparedStatement().setFloat(3, mountain.getAltitude());
            db.getPreparedStatement().setString(4, mountain.getImage());
            db.getPreparedStatement().setString(5, mountain.getDescription());
            db.getPreparedStatement().setInt(6, mountain.getId());
            
            db.getPreparedStatement().executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MountainDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        db.close();
    }
}