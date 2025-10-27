package com.example.demo.config;

import com.example.demo.entities.Client;
import com.example.demo.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DataSeeder implements CommandLineRunner {
    private final ClientRepository clientRepository;
    public DataSeeder(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void run(String... args) {
        if (clientRepository.count() == 0) {

            clientRepository.save(new Client(720, "Bajo", "Activo"));
            clientRepository.save(new Client(650, "Medio", "Activo"));
            clientRepository.save(new Client(580, "Alto", "Bloqueado"));
            clientRepository.save(new Client(800, "Bajo", "Activo"));
            clientRepository.save(new Client(430, "Muy Alto", "Inactivo"));
            clientRepository.save(new Client(760, "Bajo", "Activo"));
            clientRepository.save(new Client(610, "Medio", "En revisión"));
            clientRepository.save(new Client(700, "Bajo", "Activo"));
            clientRepository.save(new Client(500, "Alto", "Bloqueado"));
            clientRepository.save(new Client(670, "Medio", "Activo"));
        }
    }
}
