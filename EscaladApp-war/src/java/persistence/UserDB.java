package persistence;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Mountain;
import model.User;

public class UserDB {
    public static User getByUsername(String username) {
        User user = new User();
        
        DB db = new DB();
        try {
            db.setPreparedStatement(db.getConnection().prepareStatement("SELECT * FROM users WHERE username=?"));
            db.getPreparedStatement().setString(1, username);
            
            ResultSet resultSet = db.getPreparedStatement().executeQuery();
            while(resultSet.next()) {
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setName(resultSet.getString("name"));
                user.setSurname(resultSet.getString("surname"));
                user.setAdministrator(resultSet.getBoolean("administrator"));
                user.setCreationDate(resultSet.getDate("creationDate"));
                user.setFavourites(getUserFavourites(user.getId()));
                user.setClimbed(getUserClimbed(user.getId()));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.close();
        
        return user;
    }
    
    public static void insertUser(User user) {
        DB db = new DB();
        
        try {
            db.setPreparedStatement(db.getConnection()
                    .prepareStatement("INSERT INTO users(username, password, email, creationDate) VALUES (?, ?, ?, ?)"));
            db.getPreparedStatement().setString(1, user.getUsername());
            db.getPreparedStatement().setString(2, user.getPassword());
            db.getPreparedStatement().setString(3, user.getEmail());
            db.getPreparedStatement().setDate(4, new Date(user.getCreationDate().getTime()));
            
            db.getPreparedStatement().executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        db.close();
    }

    private static ArrayList<Mountain> getUserFavourites(int userId) {
        ArrayList<Mountain> favourites = new ArrayList<>();
        ArrayList<Integer> mountainIds = FavouriteDB.getByUserId(userId);
        
        /*mountainIds.stream().forEach((mountainId) -> {
            favourites.add(MountainDB.getById(mountainId));
        });*/
        
        return favourites;
    }

    private static ArrayList<Mountain> getUserClimbed(int userId) {
        ArrayList<Mountain> climbed = new ArrayList<>();
        ArrayList<Integer> mountainIds = ClimbedDB.getByUserId(userId);
        
        /*mountainIds.stream().forEach((mountainId) -> {
            climbed.add(MountainDB.getById(mountainId));
        });*/
        
        return climbed;
    }
}