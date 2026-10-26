package com.example.demo.model;

public class onibus {
    private String linha;
    private int capacidade;

    public onibus(String linha, int capacidade) {
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
