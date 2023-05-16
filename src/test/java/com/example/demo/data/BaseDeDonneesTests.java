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
        Voiture voiture = new Voiture(1, "Dodoche", 5);
        when(voitureRepository.save(voiture)).thenReturn(voiture);
    }

    @Test
    void findVoiture(){
        Voiture voiture = new Voiture(2, "Dodoche", 5);
        when(voitureRepository.findById(3)).thenReturn(java.util.Optional.of(voiture));
    }

    @Test
    void findAllVoiture(){
        Voiture voiture = new Voiture(3, "Dodoche", 5);
        when(voitureRepository.findAll()).thenReturn(Collections.singletonList(voiture));
    }

    @Test
    void updateVoiture(){
        Voiture voiture = new Voiture(4, "Dodoche", 5);
        when(voitureRepository.save(voiture)).thenReturn(voiture);
    }

    @Test
    void supprimerVoiture(){
        Voiture voiture = new Voiture(5, "Dodoche", 5);
        voitureRepository.deleteById(5);
        when(voitureRepository.findById(5)).thenReturn(java.util.Optional.empty());
    }

}
