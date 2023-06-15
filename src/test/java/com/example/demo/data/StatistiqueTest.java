package com.example.demo.service;

import com.example.demo.data.Voiture;
import com.example.demo.data.VoitureRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;
import service.Echantillon;
import service.Statistiques;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@SpringBootTest
public class StatistiqueTest {

    @MockBean
    Statistiques statistique;

    @Test
    void statAucuneVoiture(){
        when(statistique.prixMoyen()).thenReturn(new Echantillon(0, 0));
    }

    @Test
    void stat1Voiture(){
        //Créer une voiture puis calculer la moyenne du prix donc = le prix lui même
        doNothing().when(statistique).ajouter(new Voiture(1,"Ferrari", 5000));
        when(statistique.prixMoyen()).thenReturn(new Echantillon(1, 5000));
    }

    @Test
    void statVoiture(){
        //Créer deux voitures puis calculer la moyenne des prix
        doNothing().when(statistique).ajouter(new Voiture(1,"Ferrari", 1000));
        doNothing().when(statistique).ajouter(new Voiture(1,"Porsche", 3000));
        when(statistique.prixMoyen()).thenReturn(new Echantillon(2, 2000));
    }

}
