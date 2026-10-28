package com.example.demo.controller;

import com.example.demo.model.Onibus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passageiros")
public class TesteController {

 
    @GetMapping
    public Onibus buscarPassageiro() {
        return new Onibus(
            "João",
            2
        );
    }

    @GetMapping("/ativos")
    public String listarAtivos() {
        return "Passageiros ativos";
    }
}