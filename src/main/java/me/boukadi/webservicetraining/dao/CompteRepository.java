package me.boukadi.webservicetraining.dao;

import me.boukadi.webservicetraining.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
