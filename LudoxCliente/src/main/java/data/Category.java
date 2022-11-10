/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author CARLA LLENAS
 */
public class Category {

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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

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
