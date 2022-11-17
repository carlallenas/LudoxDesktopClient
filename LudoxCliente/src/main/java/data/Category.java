/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
/**
 *
 * @author CARLA LLENAS
 */
@Entity
public class Category implements Serializable {
    private static final long serialVersionUID = 3;
    private int ID;
    private String category;

    public Category() {
    }

    public Category(String category) {
        this.category = capitalize(category);
    }

    public Category(int ID, String category) {
        this.ID = ID;
        this.category = capitalize(category);
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
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = capitalize(category);
    }

    public static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

}
