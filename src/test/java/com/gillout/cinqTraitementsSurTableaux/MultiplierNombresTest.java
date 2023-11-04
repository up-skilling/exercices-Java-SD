package com.gillout.cinqTraitementsSurTableaux;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MultiplierNombresTest {
    MultiplierNombres multiplierNombres = new MultiplierNombres();

    @DisplayName("Test de la méthode doubleValue")
    @Test
    void doitRetournerLesValeursMultiplieesParDeux() {
        // Given
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);
        List<Integer> attendu = List.of(2, 4, 10, 20, 30);

        // When
        List<Integer> actuel = multiplierNombres.doubleValue(nombres);

        // Then
        assertNotNull(actuel);
        assertThat(actuel.size()).isEqualTo(attendu.size());
        assertThat(actuel).isEqualTo(attendu);
    }

    @DisplayName("Test de la méthode doubleValue")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerUneExceptionSiVideOuNull(List<Integer> nombres) {
        // Given
        String messageAttendu = "Liste invalide";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> multiplierNombres.doubleValue(nombres));
        String messageActuel = actuel.getMessage();
        assertTrue(messageActuel.contains(messageAttendu));
    }
}
