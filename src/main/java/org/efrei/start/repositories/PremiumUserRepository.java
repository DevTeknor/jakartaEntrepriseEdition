package org.efrei.start.repositories;

import org.efrei.start.models.PremiumUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PremiumUserRepository extends JpaRepository<PremiumUser, String> {
}
