package org.efrei.start.services;

import java.util.List;
import java.util.Optional;

import org.efrei.start.dto.CreateShowing;
import org.efrei.start.models.Movie;
import org.efrei.start.models.Showing;
import org.efrei.start.repositories.MovieRepository;
import org.efrei.start.repositories.ShowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowingService {
    private final ShowingRepository repository;
    private final MovieRepository movieRepository;

    @Autowired
    public ShowingService(ShowingRepository repository, MovieRepository movieRepository) {
        this.repository = repository;
        this.movieRepository = movieRepository;
    }

    public List<Showing> findAll() {
        return repository.findAll();
    }

    public Showing findById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void create(CreateShowing createShowing) {
        Movie movie = findMovieById(createShowing.getMovieId());
        if (movie != null) {
            Showing showing = new Showing();
            showing.setMovie(movie);
            showing.setNbSits(createShowing.getNbSits());
            repository.save(showing);
        }
    }

    public void update(String id, Showing showing) {
        if (findById(id) != null) {
            repository.save(showing);
        }
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public Movie findMovieById(Long movieId) {
        Optional<Movie> movie = movieRepository.findById(movieId);
        return movie.orElse(null);
    }
}