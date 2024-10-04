package org.efrei.start.services;

import java.util.List;

import org.efrei.start.dto.CreatePremiumUser;
import org.efrei.start.models.PremiumUser;
import org.efrei.start.repositories.PremiumUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PremiumUserService {
    private final PremiumUserRepository repository;

    @Autowired
    public PremiumUserService(PremiumUserRepository repository) {
        this.repository = repository;
    }

    public List<PremiumUser> findAll() {
        return repository.findAll();
    }

    public PremiumUser findById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void create(CreatePremiumUser createPremiumUser) {
        PremiumUser user = new PremiumUser();
        user.setId(Long.valueOf(java.util.UUID.randomUUID().toString())); // Génère un ID unique
        user.setFirstname(createPremiumUser.getFirstname());
        user.setLastname(createPremiumUser.getLastname());
        repository.save(user);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public void update(String id, PremiumUser premiumUser) {
        PremiumUser updatedUser = findById(id);
        if (updatedUser != null) {
            updatedUser.setFirstname(premiumUser.getFirstname());
            updatedUser.setLastname(premiumUser.getLastname());
            repository.save(updatedUser);
        }
    }
}