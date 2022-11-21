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
public class GameScore implements Serializable {
    private static final long serialVersionUID = 4;
    private int id;
    private double score;
    private User user;
    private Videogame videogame;

    public GameScore(double score, User user, Videogame videogame) {
        this.score = score;
        this.user = user;
        this.videogame = videogame;
    }

    public GameScore(int id, double score, User user, Videogame videogame) {
        this.id = id;
        this.score = score;
        this.user = user;
        this.videogame = videogame;
    }

    public GameScore() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Videogame getVideogame() {
        return videogame;
    }

    public void setVideogame(Videogame videogame) {
        this.videogame = videogame;
    }

}
