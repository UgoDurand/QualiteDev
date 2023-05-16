package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        //Test si une voiture a bien une marque et si la classe est bien une voiture
        Voiture v = new Voiture(1,"Dodoche", 3);
        Assert.hasText(v.getMarque());
        Assert.isInstanceOf(Voiture.class,v);


    }

}
