package com.gillout.trenteSixExercices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NombreEnSecondesTest {
    private final NombreEnSecondes nombreEnSecondes = new NombreEnSecondes();

    @DisplayName("Test de la méthode secondToMin")
    @Test
    void doitRenvoyerUneChaineContenantLesMinutesEtLesSecondes() {
        // Given
        int secondes = 325;
        String attendu = "5:25";

        // When
        String actuel = nombreEnSecondes.secondToMin(secondes);

        // Then
        assertThat(actuel).isEqualTo(attendu);
    }

    @DisplayName("Test de la méthode secondToMin si le nombre est égale à 0")
    @Test
    void doitRenvoyerUneChainePreciseSiLeNombreEstEgaleAZero() {
        // Given
        int secondes = 0;
        String attendu = "0:00";

        // When
        String actuel = nombreEnSecondes.secondToMin(secondes);

        // Then
        assertThat(actuel).isEqualTo(attendu);
    }

    @DisplayName("Test de la méthode secondToMin si le nombre est inférieur à 0")
    @Test
    void doitRenvoyerUneExceptionSiLeNombreEstInférieurAZero() {
        // Given
        int secondes = -2;
        String messageAttendu = "Nombre invalide";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> nombreEnSecondes.secondToMin(secondes));
        String messageActuel = actuel.getMessage();
        assertTrue(messageActuel.contains(messageAttendu));
    }
}
