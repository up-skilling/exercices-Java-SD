package com.gillout.cinqTraitementsSurTableaux;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MultiplierNombresTest {
    @DisplayName("Test de la méthode doubleValue")
    @Test
    void doitRetournerLesValeursMultiplieesParDeux() {
        // Given (étant donné les données initiales) => ici on fait toutes les initialisations
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);

        // When (quand) => ici on fait appel à la fonction que l'on veut tester
        List<Integer> nbrs = MultiplierNombres.doubleValue(nombres);

        // Then (alors) => ici on fait tous les tests (asserts)
        assertNotNull(nbrs);
//        assertTrue(verificationDeLaTaille(nombres, nbrs));
        assertEquals(5, nbrs.size());
//        assertTrue(verificationDesValeurs(nombres, nbrs));
        assertEquals(Arrays.asList(2, 4, 10, 20, 30), nbrs);
    }

    boolean verificationDeLaTaille(List<Integer> nombres, List<Integer> nbrs) {
        return nombres.size() == nbrs.size();
    }

    boolean verificationDesValeurs(List<Integer> nombres, List<Integer> nbrs) {
        for(int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i) * 2 != nbrs.get(i)) {
                return false;
            }
        }
        return true;
    }
}
