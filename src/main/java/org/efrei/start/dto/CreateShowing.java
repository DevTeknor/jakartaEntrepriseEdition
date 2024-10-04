package org.efrei.start.dto;

public class CreateShowing {
    private Long movieId;
    private int nbSits;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public int getNbSits() {
        return nbSits;
    }

    public void setNbSits(int nbSits) {
        this.nbSits = nbSits;
    }
}
