package me.boukadi.webservicetraining.web;

import me.boukadi.webservicetraining.dao.CompteRepository;
import me.boukadi.webservicetraining.entity.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

// without spring we need to instantiate Jersey servlet in web.xml file, but with spring we have to use a config
// class to do so.


@Component
@Path("/bank")
public class CompteJAXRS {
    @Autowired
    CompteRepository compteRepository;

    @Path("/comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON/*, MediaType.APPLICATION_XML*/})
    public List<Compte> getAll() {
        return compteRepository.findAll();
    }

    @Path("/comptes/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Optional<Compte> get(@PathParam(value = "id") Long id) {
        return compteRepository.findById(id);
    }

    @Path("/comptes")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Compte save(Compte compte) {
        return compteRepository.save(compte);
    }

    @Path("/comptes/{id}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public Compte update(Compte compte, @PathParam(value = "id") Long id) {
        return compteRepository.save(compte);
    }

    @Path("/comptes/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    public void delete(@PathParam(value = "id") Long id) {
        compteRepository.deleteById(id);
    }

}
