package com.example;

public class Computador extends Jogador {

    @Override
    public String toString() {
        return "Computador []";
    }

    @Override
    public boolean parou() {
        return this.getPontos() > 16; 

        
    }

    
    
}
