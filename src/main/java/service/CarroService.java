package service;

import model.Carro;

public class CarroService {
    public void ligar(Carro carro) {
        carro.setLigado(true);
    }

    public void desligar(Carro carro) {
        if (carro.getVelocidadeAtual()==0) {
            carro.setLigado(false);
        }
    }

    public void mostrarEstadoAtual(Carro carro) {
        System.out.println(carro.toString());
    }

    public void acelerar(Carro carro, int velocidade) {
        if (carro.getLigado()) {
            if ((carro.getVelocidadeAtual() + velocidade) > carro.getVelocidadeMaxima()) {
                carro.setVelocidadeAtual(carro.getVelocidadeMaxima());
            } else {
                carro.setVelocidadeAtual(carro.getVelocidadeAtual() + velocidade);
            }
        }
    }

    public void frear(Carro carro, int velocidade) {
        if (carro.getLigado()) {
            if ((carro.getVelocidadeAtual() - velocidade) >= 0) {
                carro.setVelocidadeAtual(carro.getVelocidadeAtual() - velocidade);
            } else {
                carro.setVelocidadeAtual(0);
            }
        }
    }
}
