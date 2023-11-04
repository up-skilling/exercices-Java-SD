package com.gillout.trenteSixExercices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TableauMinMaxDepuisTableauTest {
    private final TableauMinMaxDepuisTableau tableauMinMaxDepuisTableau = new TableauMinMaxDepuisTableau();
    @DisplayName("Test de la méthode minMax")
    @Test
    void doitRenvoyerUnTableauContenantLaPlusPetiteEtLaPlusGrandeValeur() {
        // Given
        List<Integer> listePrix = List.of(1, 4, 5, 19, 21, 2);
        List<Integer> attendu = List.of(1, 21);

        // When
        List<Integer> actuel = tableauMinMaxDepuisTableau.minMax(listePrix);

        // Then
        assertEquals(attendu, actuel);
    }

    @DisplayName("Test de la méthode minMax si le tableau ne contient qu'une valeur")
    @Test
    void doitRenvoyerUneExceptionSiLeTableauNeContientQuUneValeur() {
        // Given
        List<Integer> listePrix = List.of(18);
        String messageAttendu = "Le tableau ne contient qu'une valeur";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> tableauMinMaxDepuisTableau.minMax(listePrix));
        String messageActuel = actuel.getMessage();
        assertEquals(messageAttendu, messageActuel);
    }

    @DisplayName("Test de la méthode minMax si le tableau est vide ou null")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerUneExceptionSiLeTableauEstVideOuNull(List<Integer> listePrix) {
        // Given
        String messageAttendu = "Le tableau est vide ou null";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> tableauMinMaxDepuisTableau.minMax(listePrix));
        String messageActuel = actuel.getMessage();
        assertEquals(messageAttendu, messageActuel);
    }
}
