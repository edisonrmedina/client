package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Clientes")
@Data
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int creditScore;
    private String riskLevel;
    private String externalStatus;

    public Client(int creditScore, String riskLevel, String externalStatus) {
        this.creditScore = creditScore;
        this.riskLevel = riskLevel;
        this.externalStatus = externalStatus;
    }
}
