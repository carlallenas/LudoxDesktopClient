/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import jakarta.persistence.*;

import java.io.Serializable;

/**
 *
 * @author CARLA LLENAS
 */
@Entity
public class Platforms implements Serializable {
    private static final long serialVersionUID = 5;
    private int ID;
    private String name;

    public Platforms() {
    }

    public Platforms(String name) {
        this.name = name;
    }

    public Platforms(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Column(unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
