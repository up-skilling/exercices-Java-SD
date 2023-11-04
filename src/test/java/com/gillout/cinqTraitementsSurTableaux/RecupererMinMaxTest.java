package com.gillout.cinqTraitementsSurTableaux;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecupererMinMaxTest {
    private final RecupererMinMax recupererMinMax = new RecupererMinMax();
    @DisplayName("Test de la méthode minValue")
    @Test
    void doitRenvoyerLaValeurMinimum() {
        // Given
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);
        Integer attendu = 1;

        // When
        Integer actuel = recupererMinMax.minValue(nombres);

        // Then
        assertNotNull(actuel);
        assertEquals(attendu, actuel);
    }

    @DisplayName("Test de la méthode minValue si le tableau est vide ou null")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerUneExceptionSiVideOuNullPourMin(List<Integer> nombres) {
        // Given
        String messageAttendu = "Liste invalide";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> recupererMinMax.minValue(nombres));
        String messageActuel = actuel.getMessage();
        assertTrue(messageActuel.contains(messageAttendu));
    }

    @DisplayName("Test de la méthode maxValue")
    @Test
    void doitRenvoyerLaValeurMaximum() {
        // Given
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);
        Integer attendu = 15;

        // When
        Integer actuel = recupererMinMax.maxValue(nombres);

        // Then
        assertNotNull(actuel);
        assertEquals(attendu, actuel);
    }

    @DisplayName("Test de la méthode maxValue si le tableau est vide ou null")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerUneExceptionSiVideOuNullPourMax(List<Integer> nombres) {
        // Given
        String messageAttendu = "Liste invalide";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> recupererMinMax.maxValue(nombres));
        String messageActuel = actuel.getMessage();
        assertTrue(messageActuel.contains(messageAttendu));
    }
}
