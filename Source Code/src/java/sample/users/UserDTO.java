/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.users;

import java.io.Serializable;

/**
 *
 * @author HiGien
 */
public class UserDTO implements Serializable{
    private String username;
    private String password;
    private String name;
    private boolean role;

    public UserDTO() {
    }

    public UserDTO(String username, String password, String name, boolean role) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
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

    @Override
    public String toString() {
        return "UserDTO{" + "username=" + username + ", password=" + password + ", name=" + name + ", role=" + role + '}';
    }
    
}
