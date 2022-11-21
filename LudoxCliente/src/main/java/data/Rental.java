/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author CARLA LLENAS
 */
@Entity
public class Rental implements Serializable {

    private static final long serialVersionUID = 6;
    private int rentalID;
    private Date rentalDate;
    private Date finalDate;
    private Videogame videogame;
    private User user;

    public Rental() {
    }

    public Rental(Date rentalDate, Date finalDate, Videogame videogame, User user) {
        this.rentalDate = rentalDate;
        this.finalDate = finalDate;
        this.videogame = videogame;
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getRentalID() {
        return rentalID;
    }

    public void setRentalID(int rentalID) {
        this.rentalID = rentalID;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Videogame getVideogame() {
        return videogame;
    }

    public void setVideogame(Videogame videogame) {
        this.videogame = videogame;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
