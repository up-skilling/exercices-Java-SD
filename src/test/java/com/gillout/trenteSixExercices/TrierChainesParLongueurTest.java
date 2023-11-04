package com.gillout.trenteSixExercices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrierChainesParLongueurTest {
    private final TrierChainesParLongueur trierChainesParLongueur = new TrierChainesParLongueur();

    @DisplayName("Test de la méthode sortStringAscending")
    @Test
    void doitRenvoyerUnTableauTrierParOrdreDeLongueurCroissant() {
        // Given
        List<String> listeMots = List.of("Télescopes", "Lunettes", "Yeux", "Monocles");
        List<String> attendu = List.of("Yeux", "Lunettes", "Monocles", "Télescopes");

        // When
        List<String> actuel = trierChainesParLongueur.sortStringAscending(listeMots);

        // Then
        assertEquals(attendu, actuel);
    }

    @DisplayName("Test de la méthode sortStringAscending si le tableau est vide ou null")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerUnTableauVideSiLeTableauEstVideOuNull(List<String> listeMots) {
        // Given
        List<String> attendu = List.of();

        // When
        List<String> actuel = trierChainesParLongueur.sortStringAscending(listeMots);

        // Then
        assertEquals(attendu, actuel);
    }
}
