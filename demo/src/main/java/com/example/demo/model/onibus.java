package com.example.demo.model;

public class Onibus {
    private String linha;
    private int capacidade;

    public Onibus(String linha, int capacidade) {
        this.linha = linha;
        this.capacidade = capacidade;
    }

    private String getLinha(){
            return linha;
    }

    private int getCapacidade(){
            return capacidade;
    }
}
