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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 *
 * @author CARLA LLENAS
 */
@Entity
public class Videogame implements Serializable {

    private static final long serialVersionUID = 2;


    private String description;
    private String developer;
    private double finalScore;
    private int ID;
    private String imagePath;
    private String name;
    private String publisher;
    private Date releaseDate;
    private int stock;
    private List<Rental> rentals;
    private List<GameScore> scores;
    private List<Platforms> platforms;
    private List<Category> category;
    
    public Videogame() {
    }

    public Videogame(String description, String developer, String name, String publisher, Date releaseDate) {
        this.description = description;
        this.developer = developer;
        this.name = name;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.category = new ArrayList<>();
        this.scores = new ArrayList<>();
        this.rentals = new ArrayList<>();
        this.platforms = new ArrayList<>();
    }

    public Videogame(List<Category> category, String description, String developer, double finalScore, int ID, String imagePath, String name, String publisher, Date releaseDate, List<Rental> rentals, List<GameScore> scores, int stock, List<Platforms> platforms) {
        this.category = category;
        this.description = description;
        this.developer = developer;
        this.finalScore = finalScore;
        this.ID = ID;
        this.imagePath = imagePath;
        this.name = name;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.rentals = rentals;
        this.scores = scores;
        this.stock = stock;
        this.platforms = platforms;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getID() {
        return ID;
    }

    @Column(unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(length = 500)
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

    @OneToMany(mappedBy = "videogame", cascade = CascadeType.ALL)
    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @OneToMany(cascade = CascadeType.ALL)
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

    @OneToMany(mappedBy = "videogame", cascade = CascadeType.ALL)
    public List<GameScore> getScores() {
        return scores;
    }

    public void setScores(List<GameScore> scores) {
        this.scores = scores;
    }

    @OneToMany(cascade = CascadeType.ALL)
    public List<Platforms> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platforms> platforms) {
        this.platforms = platforms;
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

}