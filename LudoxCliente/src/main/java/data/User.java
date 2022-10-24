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
    public boolean isAdmin = false;
    private static final long serialVersionUID = 123456789;

    /**
     * constructor de la clase.
     *
     * @param username nom de l'usuari.
     * @param password contrasenya de l'usuari.
     * @param name nom i cognoms de l'usuari.
     * @param mail correu electrònic de l'usuari.
     * @param isAdmin booleana ens diu si l'usuari és administrador.
     */
    public User(String password, String username, String name, String mail, boolean isAdmin) {
        this.password = password;
        this.username = username;
        this.name = name;
        this.mail = mail;
        this.isAdmin = isAdmin;
    }

    public User() {

    }

    /**
     * metodes get i set del constructor.
     */
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
