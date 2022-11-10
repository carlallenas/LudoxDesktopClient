/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author CARLA LLENAS
 */
public class Videogame implements Serializable {

    private static final long serialVersionUID = 2;

    private List<Category> category;
    private String description;
    private String developer;
    private double finalScore;
    private int ID;
    private String imagePath;
    private String name;
    private String publisher;
    private Date releaseDate;
    private List<Rental> rentals;
    private List<GameScore> scores;
    private int stock;

    public Videogame() {
    }

    public Videogame(String name, String company, String description, Date releaseDate, List<Category> category) {
        this.name = name;
        this.developer = company;
        this.description = description;
        this.releaseDate = releaseDate;
        if (category != null) {
            this.category = category;
        } else {
            this.category = new ArrayList<>();
        }
    }

    public Videogame(int ID, String name, String developer, String publisher, String description, Date releaseDate, List<Rental> rentals, List<Category> category, List<GameScore> scores, double finalScore, int stock, String imagePath) {
        this.ID = ID;
        this.name = name;
        this.developer = developer;
        this.publisher = publisher;
        this.description = description;
        this.releaseDate = releaseDate;
        this.rentals = rentals;
        this.category = category;
        this.scores = scores;
        this.finalScore = finalScore;
        this.stock = stock;
        this.imagePath = imagePath;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    public void addScore(User user, double score) {
        if (this.scores == null) {
            this.scores = new ArrayList<>();
        }
        this.scores.add(new GameScore(score, user, this));
        updateScore();
    }

    public void updateScore() {
        double finalScore = 0;
        if (this.scores == null) {
            this.scores = new ArrayList<>();
        }

        for (GameScore gameScore : scores) {
            finalScore += gameScore.getScore();
        }
        finalScore /= scores.size();
        finalScore = Math.round(finalScore * 100.0) / 100.0;
        setFinalScore(finalScore);

    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<GameScore> getScores() {
        return scores;
    }

    public void setScores(List<GameScore> scores) {
        this.scores = scores;
    }

}
