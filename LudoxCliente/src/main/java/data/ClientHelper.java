/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import forms.admin.AltaVideojuegos;
import helpers.QueryFilter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CARLA LLENAS
 */
public class ClientHelper {

    public static List<Videogame> listVideogamesTop5;
    public static List<Platforms> listPlataformas;
    public static List<Category> listCategory;
    public static String userName;
    public static String videogameName;
    public static List<Videogame> gameList;

    /**
     * constructor de la classe
     *
     * @param listVideogamesTop5
     * @param listCategory
     * @param listPlataformas
     */
    public ClientHelper(List<Videogame> listVideogamesTop5, List<Category> listCategory, List<Platforms> listPlataformas) {
        this.listPlataformas = listPlataformas;
        this.listCategory = listCategory;
        this.listVideogamesTop5 = listVideogamesTop5;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUsername(String username) {
        ClientHelper.userName = username;
    }

    public static void setVideogameName(String videogameName) {
        ClientHelper.videogameName = videogameName;
    }

    /**
     * metode que converteix una dada string a tipus Date
     *
     * @param stringDate
     * @return date
     */
    public static Date ConvertStringToDate(String stringDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        try {
            date = formatter.parse(stringDate);
        } catch (ParseException ex) {
            Logger.getLogger(AltaVideojuegos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }

    /**
     * metode que ens actualitzara les llistes de videojocs filtrats o no.
     *
     * @param qf
     * @param qfOld
     * @return
     */
    public static boolean filterChange(QueryFilter qf, QueryFilter qfOld) {
        if (qf == null) {
            return false;
        }

        if (qfOld == null) {
            return false;
        }

        if (qf.getName() == null) {
            qf.setName("");
        }

        if (qf.getCategoryName() == null) {
            qf.setCategoryName("");
        }

        if (qf.getDate() == null) {
            qf.setDate("");
        }

        if (qf.getPlatformName() == null) {
            qf.setPlatformName("");
        }

        if (qfOld.getName() == null) {
            qfOld.setName("");
        }

        if (qfOld.getCategoryName() == null) {
            qfOld.setCategoryName("");
        }

        if (qfOld.getDate() == null) {
            qfOld.setDate("");
        }

        if (qfOld.getPlatformName() == null) {
            qfOld.setPlatformName("");
        }
        return !(qf.getName().equals(qfOld.getName()) && qf.getDate().equals(qfOld.getDate()) && qf.getPlatformName().equals(qfOld.getPlatformName()) && qf.getCategoryName().equals(qfOld.getCategoryName()) && qf.getScore() == qfOld.getScore());
    }

    /**
     * metode que ens ajudara a validar si la puntuacio esta entre dos valors i,
     * per tant, si es valida o no
     * el parametre es la puntuacio
     * @param score
     * @return
     */
    public static double isScoreValid(String score) {
        try {
            double scoreDouble = Double.parseDouble(score.replace(",", "."));
            if (scoreDouble >= 0 && scoreDouble <= 10) {
                return scoreDouble;
            }
        } catch (NumberFormatException ex) {
            return -1;
        }
        return -1;
    }
}
