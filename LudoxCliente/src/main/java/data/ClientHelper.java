/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;

/**
 *
 * @author CARLA LLENAS
 */
public class ClientHelper {

    public static List<Videogame> listVideogamesTop5;
    public static List<Platforms> listPlataformas;
    public static List<Category> listCategory;
    public static String username;


    public ClientHelper(List<Videogame> listVideogamesTop5, List<Category> listCategory, List<Platforms> listPlataformas) {
        this.listPlataformas = listPlataformas;
        this.listCategory = listCategory;
        this.listVideogamesTop5 = listVideogamesTop5;
    }

    public static void setUsername(String username) {
        ClientHelper.username = username;
    }


}
