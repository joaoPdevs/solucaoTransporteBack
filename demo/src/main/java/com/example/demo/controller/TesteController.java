package com.example.demo.controller;

import com.example.demo.model.onibus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passageiros")
public class TesteController {

 
    @GetMapping
    public onibus buscarPassageiro() {
        return new onibus(
            "João",
            2
        );
    }

    @GetMapping("/ativos")
    public String listarAtivos() {
        return "Passageiros ativos";
    }
}