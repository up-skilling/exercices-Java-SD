package com.gillout.cinqTraitementsSurTableaux;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VerifierSiNombreImpairTest {
    @DisplayName("Test de la méthode isThereOdd")
    @Test
    void doitRenvoyerVraiSiUnNombreImpairEstPresent() {
        // Given (étant donné les données initiales) => ici on fait toutes les initialisations
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);

        // When (quand) => ici on fait appel à la fonction que l'on veut tester
        Boolean impair = VerifierSiNombreImpair.isThereOdd(nombres);

        // Then (alors) => ici on fait tous les tests (asserts)
        assertNotNull(impair);
        assertTrue(impair);
    }

    @DisplayName("Test de la méthode isThereOdd")
    @Test
    void doitRenvoyerFauxSiPasDeNombreImpair() {
        // Given (étant donné les données initiales) => ici on fait toutes les initialisations
        List<Integer> nombres = Arrays.asList(0, 2, 6, 10, 18);

        // When (quand) => ici on fait appel à la fonction que l'on veut tester
        Boolean impair = VerifierSiNombreImpair.isThereOdd(nombres);

        // Then (alors) => ici on fait tous les tests (asserts)
        assertNotNull(impair);
        assertFalse(impair);
    }
}
