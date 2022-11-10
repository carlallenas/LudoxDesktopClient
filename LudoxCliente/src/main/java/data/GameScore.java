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
public class GameScore {

    private int id;
    private double score;
    private User user;
    private Videogame videogame;

    public GameScore(double score, User user, Videogame videogame) {
        this.score = score;
        this.user = user;
        this.videogame = videogame;
        this.videogame.updateScore();
    }

    public GameScore(int id, double score, User user, Videogame videogame) {
        this.id = id;
        this.score = score;
        this.user = user;
        this.videogame = videogame;
    }

    public GameScore() {
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Videogame getVideogame() {
        return videogame;
    }

    public void setVideogame(Videogame videogame) {
        this.videogame = videogame;
    }

}