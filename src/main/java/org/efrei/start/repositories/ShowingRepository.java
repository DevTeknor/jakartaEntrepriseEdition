package org.efrei.start.repositories;

import org.efrei.start.models.Showing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowingRepository extends JpaRepository<Showing, String> {
}