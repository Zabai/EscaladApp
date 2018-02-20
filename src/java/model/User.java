package model;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private int id;
    private String username;
    private String password;
    private String name, surname;
    private String email;
    private ArrayList<Mountain> climbed, favourites;
    private boolean administrator;
    private Date creationDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Mountain> getClimbed() {
        return climbed;
    }

    public void setClimbed(ArrayList<Mountain> climbed) {
        this.climbed = climbed;
    }

    public ArrayList<Mountain> getFavourites() {
        return favourites;
    }

    public void setFavourites(ArrayList<Mountain> favourites) {
        this.favourites = favourites;
    }

    public boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }
    
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", password=" + password + '}';
    }
}