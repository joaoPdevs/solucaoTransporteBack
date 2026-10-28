
package com.example.demo.controller;

import com.example.demo.service.ViagemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViagemController {

    private final ViagemService ViagemService;

    public ViagemController(ViagemService ViagemService) {
        this.ViagemService = ViagemService;
    }

    @GetMapping("/viagens/preco")
    public double calcularPreco(@RequestParam double distancia) {
        return ViagemService.calcularPreco(distancia);
    }
}
