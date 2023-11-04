package com.gillout.trenteSixExercices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NombreEnTableauTest {
    private final NombreEnTableau nombreEnTableau = new NombreEnTableau();

    @DisplayName("Test de la méthode reverse")
    @Test
    void doitRenvoyerUnTableauDesChiffresDuNombreDansLOrdreInverse() {
        // Given
        int nombre = 348597;
        List<Integer> attendu = List.of(7, 9, 5, 8, 4, 3);

        // When
        List<Integer> actuel = nombreEnTableau.reverse(nombre);

        // Then
        assertThat(actuel).isEqualTo(attendu);
    }

    @DisplayName("Test de la méthode reverse si le nombre est inférieur à 0")
    @Test
    void doitRenvoyerUneExceptionSiLeNombreEstInferieurAZero() {
        // Given
        int nombre = -7;
        String messageAttendu = "Nombre invalide";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> nombreEnTableau.reverse(nombre));
        String messageActuel = actuel.getMessage();
        assertEquals(messageAttendu, messageActuel);
    }
}
