/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;

/**
 *
 * @author CARLA LLENAS
 */
public class User implements Serializable {

    public String password;
    public String username;
    public String name;
    public String mail;
    public static boolean isAdmin = false;
    private static final long serialVersionUID = 123456789;


    public User(String password, String username, String name, String mail, boolean isAdmin) {
        this.password = password;
        this.username = username;
        this.name = name;
        this.mail = mail;
        this.isAdmin = isAdmin;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

}
