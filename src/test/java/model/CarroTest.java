package model;

import org.junit.Assert;
import org.junit.Test;

public class CarroTest {
    @Test
    public void carroDeveIniciarDesligado(){
        //Given
        Carro carro = new Carro();

        //Then
        Assert.assertFalse(carro.getLigado());
    }
}
