
package de.pizzaalex.model;

import java.io.Serializable;

/**
 *
 * @author AWagner
 */
public class User implements Serializable{
    private int userID;
    private String username;
    private String password;
    private String role;

    
    
    public User() {
    }

    public User(String username, String role) {
        this.username = username;
        this.userID = 0;
        this.password = "";
        this.role = role;
    }
    
    
    
    public User(int userID, String username, String password, String role) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int usID) {
        this.userID = usID;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    @Override
    public String toString() {
        return "User Nr " + userID + ": " + username 
                + ", PW: " + password + ". Rolle: "+ role;
    }
    
    
}
