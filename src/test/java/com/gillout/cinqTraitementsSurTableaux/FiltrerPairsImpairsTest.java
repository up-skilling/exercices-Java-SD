package com.gillout.cinqTraitementsSurTableaux;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FiltrerPairsImpairsTest {
    private final FiltrerPairsImpairs filtrerPairsImpairs = new FiltrerPairsImpairs();

    @DisplayName("Test de la méthode evensFilter")
    @Test
    void doitRenvoyerLesValeursPairs() {
        // Given
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);
        List<Integer> attendu = List.of(2, 10); // List.of() (depuis java 9) est un peu plus moderne Arrays.asList() (java 1.2), ils font globalement la même chose mais la 1ère est immutable (non modifiable) en gros c'est vraiment une constante

        // When
        List<Integer> actuel = filtrerPairsImpairs.evensFilter(nombres);

        // Then
        assertThat(actuel.size()).isEqualTo(attendu.size());
        assertThat(actuel).isEqualTo(attendu);
        assertTrue(actuel.containsAll(attendu) && attendu.containsAll(actuel));
    }

    @DisplayName("Test de la méthode evensFilter si la tableau est vide ou null")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerUneExceptionSiLeTableauPairEstVideOuNull(List<Integer> nombres) {
        // Given
        String messageAttendu = "Liste invalide";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> filtrerPairsImpairs.evensFilter(nombres));
        String messageActuel = actuel.getMessage();
        assertTrue(messageActuel.contains(messageAttendu));
    }

    @DisplayName("Test de la méthode oddsFilter")
    @Test
    void doitRenvoyerLesValeursImpairs() {
        // Given
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);
        List<Integer> attendu = List.of(1, 5, 15);

        // When
        List<Integer> actuel = filtrerPairsImpairs.oddsFilter(nombres);

        // Then
        assertThat(actuel.size()).isEqualTo(attendu.size());
        assertThat(actuel).isEqualTo(attendu);
        assertTrue(actuel.containsAll(attendu) && attendu.containsAll(actuel));
    }

    @DisplayName("Test de la méthode evensFilter si la tableau est vide ou null")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerUneExceptionSiLeTableauImpairEstVideOuNull(List<Integer> nombres) {
        // Given
        String messageAttendu = "Liste invalide";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> filtrerPairsImpairs.oddsFilter(nombres));
        String messageActuel = actuel.getMessage();
        assertTrue(messageActuel.contains(messageAttendu));
    }
}
