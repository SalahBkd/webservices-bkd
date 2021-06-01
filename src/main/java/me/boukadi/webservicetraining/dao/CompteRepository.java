package me.boukadi.webservicetraining.dao;

import me.boukadi.webservicetraining.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource // for Spring Data Rest
// equivalant for GraphQL in spring is Projections (checkout entity pack)
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
