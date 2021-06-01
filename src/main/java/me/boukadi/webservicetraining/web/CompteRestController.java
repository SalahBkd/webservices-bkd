package me.boukadi.webservicetraining.web;

import me.boukadi.webservicetraining.dao.CompteRepository;
import me.boukadi.webservicetraining.entity.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/bank")
public class CompteRestController {
    @Autowired
    CompteRepository compteRepository;

    @GetMapping(path = "/comptes", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Compte> getAll() {
        return compteRepository.findAll();
    }

    @GetMapping(path = "/comptes/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Optional<Compte> get(@PathVariable(value = "id") Long id) {
        return compteRepository.findById(id);
    }

    @PostMapping(path = "/comptes", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Compte save(@RequestBody Compte compte) {
        return compteRepository.save(compte);
    }

    @PutMapping(path = "/comptes/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Compte update(@RequestBody Compte compte, @PathVariable(value = "id") Long id) {
        return compteRepository.save(compte);
    }

    @DeleteMapping(path = "/comptes/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public void delete(@PathVariable(value = "id") Long id) {
        compteRepository.deleteById(id);
    }

}
