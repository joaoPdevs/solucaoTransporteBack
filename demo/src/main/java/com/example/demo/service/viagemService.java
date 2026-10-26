package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class viagemService {

    public double calcularPreco(double distancia) {
        double precoPorKm = 2.50;
        return distancia * precoPorKm;
    }
}
