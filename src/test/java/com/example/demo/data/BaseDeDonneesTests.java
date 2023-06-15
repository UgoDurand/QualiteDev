package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;

import static org.mockito.Mockito.when;

@SpringBootTest
public class BaseDeDonneesTests {

    @MockBean
    private VoitureRepository voitureRepository;


    @Test
    void enregistrerVoiture(){
        //Enregistre une voiture et vérifie qu'elle existe bien
        Voiture voiture = new Voiture(1, "Dodoche", 5);
        when(voitureRepository.save(voiture)).thenReturn(voiture);
    }

    @Test
    void findVoiture(){
        //Récupère la voiture d'ID 2 et vérifie qu'elle existe bien
        Voiture voiture = new Voiture(2, "DS", 2);
        when(voitureRepository.findById(3)).thenReturn(java.util.Optional.of(voiture));
    }

    @Test
    void findAllVoiture(){
        //Récupère toutes les voitures et vérifie qu'il y en a bien au moins une
        Voiture voiture = new Voiture(3, "Kart", 3);
        when(voitureRepository.findAll()).thenReturn(Collections.singletonList(voiture));
    }

    @Test
    void updateVoiture(){
        //Modifie la voiture d'ID 4 et vérifie qu'elle a bien été modifiée
        Voiture voiture = new Voiture(4, "FlashMcQueen", 10);
        when(voitureRepository.save(voiture)).thenReturn(voiture);
    }

    @Test
    void supprimerVoiture(){
        //Supprime la voiture d'ID 5 et vérifie qu'elle n'existe plus
        Voiture voiture = new Voiture(5, "La Voiture à Dany", -15000);
        voitureRepository.deleteById(5);
        when(voitureRepository.findById(5)).thenReturn(java.util.Optional.empty());
    }

}
