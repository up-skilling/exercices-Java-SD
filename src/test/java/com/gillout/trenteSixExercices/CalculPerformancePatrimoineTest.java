package com.gillout.trenteSixExercices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.gillout.trenteSixExercices.CalculPerformancePatrimoine.MAX;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculPerformancePatrimoineTest {
    private final CalculPerformancePatrimoine calculPerformancePatrimoine = new CalculPerformancePatrimoine();

    @DisplayName("Test de la méthode calculateYears")
    @Test
    void doitRenvoyerLeNombreDAnneesPourObtenirAuMoinsMax() {
        // Given
        double currentCash = 10000;
        int attendu = 11;

        // When
        int actuel = calculPerformancePatrimoine.calculateYears(currentCash);

        // Then
        assertThat(actuel).isEqualTo(attendu);
    }

    @DisplayName("Test de la méthode calculateYears si currentCash égal 0")
    @Test
    void doitRenvoyerUneExceptionQuandCurrentCashEgalZero() {
        // Given
        int currentCash = 0;
        String messageAttendu = "Montant de départ insuffisant";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> calculPerformancePatrimoine.calculateYears(currentCash));
        String messageActuel = actuel.getMessage();
        assertEquals(messageAttendu, messageActuel);
    }

    @DisplayName("Test de la méthode calculateYears si la valeur MAX est déjà atteinte")
    @Test
    void doitRenvoyer0QuandCurrentCashEgalMax() {
        // When
        int actuel = calculPerformancePatrimoine.calculateYears(MAX);

        // Then
        assertThat(actuel).isZero();
    }
}
