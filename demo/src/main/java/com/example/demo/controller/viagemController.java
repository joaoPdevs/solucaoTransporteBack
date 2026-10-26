
package com.example.demo.controller;

import com.example.demo.service.viagemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class viagemController {

    private final viagemService viagemService;

    public viagemController(viagemService viagemService) {
        this.viagemService = viagemService;
    }

    @GetMapping("/viagens/preco")
    public double calcularPreco(@RequestParam double distancia) {
        return viagemService.calcularPreco(distancia);
    }
}
