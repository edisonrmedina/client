package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @GetMapping("/all-samples")
    public List<Map<String,Object>> home() {
        return List.of(
                Map.of("id",1,"name","Laptop Lenovo","price",1200),
                Map.of("id", 2, "name", "Mouse Logitech", "price", 25),
                Map.of("id", 3, "name", "Monitor Samsung", "price", 300)
        );
    }
    
}
