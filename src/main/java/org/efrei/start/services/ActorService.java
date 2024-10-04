package org.efrei.start.services;


import java.util.List;

import org.efrei.start.models.Actor;
import org.efrei.start.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class ActorService {

    private final ActorRepository repository;

    @Autowired
    public ActorService(ActorRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public List<Actor> findAll() {
        return repository.findAll();
    }

    public Actor findById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void create(Actor actor) {
        repository.save(actor);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public void update(String id, Actor actor) {
        Actor updatedActor = findById(id);
        updatedActor.setName(actor.getName());
        updatedActor.setFirstname(actor.getFirstname());
        repository.save(updatedActor);
        // UPDATE actor SET (firstname, name) VALUES (:firstname, :name) where id = :id ;
    }
}