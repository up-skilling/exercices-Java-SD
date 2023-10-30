package com.gillout.cinqTraitementsSurTableaux;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecupererMinMaxTest {
    @DisplayName("Test de la méthode minValue")
    @Test
    void doitRenvoyerLaValeurMinimum() {
        // Given (étant donné les données initiales) => ici on fait toutes les initialisations
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);

        // When (quand) => ici on fait appel à la fonction que l'on veut tester
        Integer valeurMinimum = RecupererMinMax.minValue(nombres);

        // Then (alors) => ici on fait tous les tests (asserts)
        assertNotNull(valeurMinimum);
        assertEquals(1, valeurMinimum);
    }

    @DisplayName("Test de la méthode maxValue")
    @Test
    void doitRenvoyerLaValeurMaximum() {
        // Given (étant donné les données initiales) => ici on fait toutes les initialisations
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);

        // When (quand) => ici on fait appel à la fonction que l'on veut tester
        Integer valeurMaximum = RecupererMinMax.maxValue(nombres);

        // Then (alors) => ici on fait tous les tests (asserts)
        assertNotNull(valeurMaximum);
        assertEquals(15, valeurMaximum);
    }
}
