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
            clientRepository.save(new Client("Juan Pérez", "juan@example.com", "555-1234"));
            clientRepository.save(new Client("María López", "maria@example.com", "555-5678"));
            clientRepository.save(new Client("Carlos Gómez", "carlos@example.com", "555-8765"));
            clientRepository.save(new Client("Lucía Fernández", "lucia@example.com", "555-4321"));
            clientRepository.save(new Client("Pedro Ramírez", "pedro@example.com", "555-2468"));
            clientRepository.save(new Client("Ana Torres", "ana@example.com", "555-1357"));
            clientRepository.save(new Client("Jorge Herrera", "jorge@example.com", "555-9753"));
            clientRepository.save(new Client("Sofía Díaz", "sofia@example.com", "555-8642"));
            clientRepository.save(new Client("Diego Castro", "diego@example.com", "555-7531"));
            clientRepository.save(new Client("Camila Morales", "camila@example.com", "555-6420"));

        }
    }
}
