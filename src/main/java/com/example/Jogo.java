package com.example;

public class Jogo {
    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Jogador computador = new Computador();
    
    

    public Jogo(){
        monte.embaralhar();

    }

    public Carta DistribuirCartaParaJogador(Jogador jogador){

        if(jogador.parou())return null;
        var carta = monte.virar();
        jogador.receberCarta(carta);
        return carta;
    }
    
    public boolean acabou(){
        var osDoisPararam = jogador.parou() && computador.parou();
        var alguemEstourou = jogador.getPontos() > 21 || computador.getPontos() >21;

        return osDoisPararam || alguemEstourou;

    }
    public String resultado(){
        var JogadorEstourou = jogador.getPontos() > 21;
        var ComputadorEstourou = jogador.getPontos() > 21;

        if(
            JogadorEstourou && ComputadorEstourou ||
            jogador.getPontos() == computador.getPontos()
        ){
            return "Empatou";
    }

    if(!JogadorEstourou && jogador.getPontos() > computador.getPontos()){
        return "Voce ganhou";
    }

    return "Voce Perdeu";
}
}


