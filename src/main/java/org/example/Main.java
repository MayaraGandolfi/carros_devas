package org.example;

import model.Carro;
import service.CarroService;

/**
 * Um carro tem os seguintes atributos:
 * - cor
 * - marca
 * - ano
 * - ligado
 * - velocidadeAtual
 * <p>
 * Enquanto o carro estiver desligado deve ser capaz de:
 * - Ligar
 * - Motrar estado atual
 * <p>
 * Enquanto o carro estiver ligado deve ser capaz de:
 * - Desligar
 * - Acelerar
 * - Frear
 * - Motrar estado atual
 * <p>
 * Regras:
 * - O carro não pode passar de sua velocidade máxima
 * - Só podemos realizar as aacoes com o carro ligado
 * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
 * - Não existe velocidade negativa
 * <p>
 * Um carro tem os seguintes atributos:
 * - cor
 * - marca
 * - ano
 * - ligado
 * - velocidadeAtual
 * <p>
 * <p>
 * Enquanto o carro estiver desligado deve ser capaz de:
 * - Ligar
 * - Motrar estado atual
 * <p>
 * <p>
 * Enquanto o carro estiver ligado deve ser capaz de:
 * - Desligar
 * - Acelerar
 * - Frear
 * - Motrar estado atual
 * <p>
 * <p>
 * Regras:
 * - O carro não pode passar de sua velocidade máxima
 * - Só podemos realizar as ações com o carro ligado
 * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
 * - Não existe velocidade negativa
 * 909 Programa <Dev>ª | Java (8)
 */


/**
 * Meus cenários:
 * Given - Dado | When - Quando | Then - Então
 * <p>
 * Cenário 01:
 * -Dado:
 * Um carro Desligado
 * <p>
 * -Quando:
 * Ligar o Carro
 * <p>
 * -Então:
 * Carro deve estar ligado
 * <p>
 * *Cenário 2:
 * Dado:
 * Um carro
 * <p>
 * Quando:
 * Ligar o carro
 * Acelerar o carro
 * <p>
 * Então:
 * A velo deve ser 10km/h
 * <p>
 * *Cenário 3:
 * Dado:
 * Um carro
 * <p>
 * Quando:
 * Ligar o carro
 * Frear o carro
 * <p>
 * Então:
 * A velocidade deve ser 0;
 * <p>
 * Cenário 4:
 * Dado:
 * Um carro
 * <p>
 * Quando:
 * Desligar o carro
 * <p>
 * Então:
 * Velocidade deve ser 0;
 * <p>
 * Cenário 5:
 * Dado:
 * Um carro em velocidade máxima
 * <p>
 * Quando:
 * Acelerar
 * <p>
 * Então:
 * velocidade deve continuar na máxima
 * <p>
 * Cenário 6:
 * Dado:
 * Um carro ligado e parado
 * <p>
 * Quando:
 * Frear
 * <p>
 * Então:
 * Velocidade igual a 0
 * <p>
 * Cenário 7:
 * Dado:
 * Carro Desligado
 * <p>
 * Quando:
 * Acelerar
 * <p>
 * Então:
 * Não faz nada
 * <p>
 * Cenário 8:
 * Dado:
 * Carro ligado em velocidade de 20km/h
 * <p>
 * Quando:
 * Acelerar
 * <p>
 * Então:
 * Velocidade em 30km/h
 * <p>
 * Cenário 9:
 * Dado:
 * Carro ligado
 * <p>
 * Quando:
 * Ligar o carro
 * <p>
 * Então:
 * Carro deve permanecer ligado
 */

public class Main {
    public static void main(String[] args) {

        /*
        CarroService carroService = new CarroService();
        //Dado:
        Carro carro1 = new Carro();

        //uando :
        carroService.ligar(carro1);
        carroService.acelerar(carro1);
        carroService.acelerar(carro1);
        //então:
        System.out.println(carro1.getVelocidadeAtual() == 20);

        //dado um carro
        Carro carro2 = new Carro();

        //quando acelerar o carro
        carroService.acelerar(carro2);

        //então a velocidade = 0
        System.out.println(carro2.getVelocidadeAtual() == 0);


        //** ATIVIDADE **  criar 3 cenarios

        //Cenario 3
        //Dado:  Um carro ligado e parado
        Carro carro3 = new Carro();
        carroService.ligar(carro3);

        //Quando:
        carroService.frear(carro3);

        //Então:
        System.out.println(carro3.getVelocidadeAtual() == 0);

        //Cenário 4:
        //Dado: Um carro em velocidade máxima
        Carro carro4 = new Carro();
        carroService.ligar(carro4);
        carro4.setVelocidadeAtual(60);

        //Quando: Acelerar
        carroService.acelerar(carro4);

        //Então: velocidade deve continuar na máxima
        System.out.println(carro4.getVelocidadeAtual() == 60);


        //Cenario 5
        //Dado:  Carro ligado em velocidade de 20km/h
        Carro carro5 = new Carro();
        carroService.ligar(carro5);
        carro5.setVelocidadeAtual(20);

        //Quando: frear
        carroService.frear(carro5);

        //Então:Velocidade em 10km/h
        System.out.println(carro5.getVelocidadeAtual() == 10);
        */
    }
}

