package me.boukadi.webservicetraining.config;

import me.boukadi.webservicetraining.web.CompteJAXRS;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteJAXRS.class);
        return jerseyServlet;
    }

}
