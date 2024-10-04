package org.efrei.start.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "showing")
public class Showing {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    private int nbSits;

    public Showing() {
    }

    public Showing(Movie movie, int nbSits) {
        this.movie = movie;
        this.nbSits = nbSits;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getNbSits() {
        return this.nbSits;
    }

    public void setNbSits(int nbSits) {
        this.nbSits = nbSits;
    }
}
