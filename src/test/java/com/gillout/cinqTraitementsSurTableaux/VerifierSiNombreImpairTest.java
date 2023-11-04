package com.gillout.cinqTraitementsSurTableaux;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VerifierSiNombreImpairTest {
    private final VerifierSiNombreImpair verifierSiNombreImpair = new VerifierSiNombreImpair();
    @DisplayName("Test de la méthode isThereOdd")
    @Test
    void doitRenvoyerVraiSiUnNombreImpairEstPresent() {
        // Given
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);
        Boolean attendu = true;

        // When
        Boolean actuel = verifierSiNombreImpair.isThereOdd(nombres);

        // Then
        assertNotNull(actuel);
        assertEquals(attendu, actuel);
    }

    @DisplayName("Test de la méthode isThereOdd")
    @Test
    void doitRenvoyerFauxSiPasDeNombreImpair() {
        // Given
        List<Integer> nombres = Arrays.asList(0, 2, 6, 10, 18);
        Boolean attendu = false;

        // When
        Boolean actuel = verifierSiNombreImpair.isThereOdd(nombres);

        // Then
        assertNotNull(actuel);
        assertEquals(attendu, actuel);
    }

    @DisplayName("Test de la méthode doubleValue")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerUneExceptionSiVideOuNull(List<Integer> nombres) {
        // Given
        String messageAttendu = "Liste invalide";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> verifierSiNombreImpair.isThereOdd(nombres));
        String messageActuel = actuel.getMessage();
        assertThat(messageActuel).isEqualTo(messageAttendu);
    }
}
