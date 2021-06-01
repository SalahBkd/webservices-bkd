package me.boukadi.webservicetraining.dao;

import me.boukadi.webservicetraining.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource // for Spring Data Rest
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
