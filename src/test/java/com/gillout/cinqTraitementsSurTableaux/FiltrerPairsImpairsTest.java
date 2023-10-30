package com.gillout.cinqTraitementsSurTableaux;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FiltrerPairsImpairsTest {
    @DisplayName("Test de la méthode evensFilter")
    @Test
    void doitRenvoyerLesValeursPairs() {
        // Given (étant donné les données initiales) => ici on fait toutes les initialisations
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);

        // When (quand) => ici on fait appel à la fonction que l'on veut tester
        List<Integer> pairs = FiltrerPairsImpairs.evensFilter(nombres);

        // Then (alors) => ici on fait tous les tests (asserts)
        assertTrue(verificationDesValeursPairs(pairs));
    }

    @DisplayName("Test de la méthode oddsFilter")
    @Test
    void doitRenvoyerLesValeursImpairs() {
        // Given (étant donné les données initiales) => ici on fait toutes les initialisations
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);

        // When (quand) => ici on fait appel à la fonction que l'on veut tester
        List<Integer> impairs = FiltrerPairsImpairs.oddsFilter(nombres);

        // Then (alors) => ici on fait tous les tests (asserts)
        assertTrue(verificationDesValeursImpairs(impairs));
    }

    boolean verificationDesValeursPairs(List<Integer> pairs) {
        for(int i = 0; i < pairs.size(); i++) {
            if (pairs.get(i) % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    boolean verificationDesValeursImpairs(List<Integer> impairs) {
        for(Integer impair : impairs) {
            if (impair % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
