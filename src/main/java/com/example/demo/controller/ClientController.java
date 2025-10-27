package com.example.demo.controller;

import com.example.demo.entities.Client;
import com.example.demo.repository.ClientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    final private ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/all-samples")
    public List<Map<String,Object>> home() {
        return List.of(
                Map.of("id",1,"name","Laptop Lenovo","price",1200),
                Map.of("id", 2, "name", "Mouse Logitech", "price", 25),
                Map.of("id", 3, "name", "Monitor Samsung", "price", 300)
        );
    }

    @PostMapping()
    public Client save(@RequestBody Client client){
        return this.clientRepository.save(client);
    }

    @GetMapping()
    public List<Client> all(){
        return this.clientRepository.findAll();
    }
}
