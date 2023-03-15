package service;

import model.Carro;
import org.junit.Assert;
import org.junit.Test;

public class CarroServiceTest {
    @Test
    public void deveAcelerarCorretamenteUmCarroLigado() {
        //Given:
        CarroService carroService = new CarroService();
        Carro carro = new Carro(100);
        carroService.ligar(carro);

        //When:
        carroService.acelerar(carro,30);

        //Then: - Asserts
        Integer valocidadeEsperada = 30;
        Assert.assertEquals(valocidadeEsperada, carro.getVelocidadeAtual());

    }

    @Test
    public void deveLigarCorretamente() {
        //Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        //When
        carroService.ligar(carro);

        //Then
        Assert.assertTrue(carro.getLigado());

    }

    //Atividade - criar 5 cenarios
    @Test
    public void carroLigadoComVelocidadeMaiorQueZeroNaoPodeDesligar(){
        //Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carro.setLigado(true);
        carro.setVelocidadeAtual(10);

        //When
        carroService.desligar(carro);

        //Then
        Assert.assertTrue(carro.getLigado());

    }
    @Test
    public void carroDesligadoNaoDeveAcelerar() {
        //Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        //When
        carroService.acelerar(carro,10);

        //Then
        Assert.assertEquals((Integer) 0, carro.getVelocidadeAtual());
    }

    @Test
    public void deveFrearCorretamenteUmCarro(){

        //Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);
        carro.setVelocidadeAtual(100);

        //When
        carroService.frear(carro,20);

        //Then
        Assert.assertEquals((Integer) 80, carro.getVelocidadeAtual());

    }

    @Test
    public void quandoFrearUmCarroLigadoEParadoAVelocidadeNaoPodeFicarNegativa() {
        //Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);

        //When
        carroService.frear(carro,20);

        //Then
        Assert.assertEquals((Integer) 0, carro.getVelocidadeAtual());
    }

    @Test
    public void carroEmVelocidadeMaximaNaoPodeAumentarVelocidade() {
        //Given
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);
        carro.setVelocidadeMaxima(120);
        carro.setVelocidadeAtual(carro.getVelocidadeMaxima());

        //When
        carroService.acelerar(carro,10);

        //Then
        Assert.assertEquals(carro.getVelocidadeMaxima(), carro.getVelocidadeAtual());


    }


}
