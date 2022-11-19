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

    public static List<Videogame> listVideogames;
    public static List<Platforms> listPlataformas;
    public static List<Category> listCategory;
    public static String username;
    public static String gameName;

    public ClientHelper(List<Videogame> listVideogames, List<Category> listCategory, List<Platforms> listPlataformas) {
        this.listPlataformas = listPlataformas;
        this.listCategory = listCategory;
        this.listVideogames = listVideogames;
    }

    public static void setUsername(String username) {
        ClientHelper.username = username;
    }

    public static void setgameName(String gameName) {
        ClientHelper.gameName = gameName;
    }

}
