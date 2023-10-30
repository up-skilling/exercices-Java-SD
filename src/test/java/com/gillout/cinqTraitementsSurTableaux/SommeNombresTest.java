package com.gillout.cinqTraitementsSurTableaux;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SommeNombresTest {
    @DisplayName("Test de la méthode numbersSumWithMap")
    @Test
    void doitRenvoyerLaSommeDesValeurs() {
        // Given (étant donné les données initiales) => ici on fait toutes les initialisations
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);

        // When (quand) => ici on fait appel à la fonction que l'on veut tester
        Integer somme = SommeNombres.numbersSumWithMap(nombres);

        // Then (alors) => ici on fait tous les tests (asserts)
        assertNotNull(somme);
        assertEquals(33, somme);
    }

    @DisplayName("Test de la méthode numbersSumWithReduce")
    @Test
    void doitEgalementRenvoyerLaSommeDesValeurs() {
        // Given (étant donné les données initiales) => ici on fait toutes les initialisations
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);

        // When (quand) => ici on fait appel à la fonction que l'on veut tester
        Integer somme = SommeNombres.numbersSumWithReduce(nombres);

        // Then (alors) => ici on fait tous les tests (asserts)
        assertNotNull(somme);
        assertEquals(33, somme);
    }
}
