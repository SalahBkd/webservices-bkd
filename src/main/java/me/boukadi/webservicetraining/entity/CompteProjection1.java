package me.boukadi.webservicetraining.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "solde", types= Compte.class)
public interface CompteProjection1 {
    public double getSolde();
}


