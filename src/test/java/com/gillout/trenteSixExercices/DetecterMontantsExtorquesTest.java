package com.gillout.trenteSixExercices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DetecterMontantsExtorquesTest {
    private final DetecterMontantsExtorques detecterMontantsExtorques = new DetecterMontantsExtorques();

    @DisplayName("Test de la méthode sumTwoSmallestNumbers")
    @Test
    void doitRenvoyerLaSommeDesDeuxPlusPetitsNombres() {
        // Given
        List<Integer> numbers = Arrays.asList(190, 5, 4200, 2, 776);
        int attendu = 7;

        // When
        int actuel = detecterMontantsExtorques.sumTwoSmallestNumbers(numbers);

        // Then
        assertThat(actuel).isEqualTo(attendu);
    }

    @DisplayName("Test de la méthode sumTwoSmallestNumbers si la liste ne contient qu'une seule valeur")
    @Test
    void doitRenvoyerLaSeuleValeurPresente() {
        // Given
        List<Integer> numbers = List.of(190);
        int attendu = 190;

        // When
        int actuel = detecterMontantsExtorques.sumTwoSmallestNumbers(numbers);

        // Then
        assertThat(actuel).isEqualTo(attendu);
    }

    @DisplayName("Test de la méthode sumTwoSmallestNumbers si la liste est vide ou nulle")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerUneExceptionSiVideOuNull(List<Integer> nombres) {
        // Given
        String messageAttendu = "Liste invalide";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> detecterMontantsExtorques.sumTwoSmallestNumbers(nombres));
        String messageActuel = actuel.getMessage();
        assertTrue(messageActuel.contains(messageAttendu));
    }
}
