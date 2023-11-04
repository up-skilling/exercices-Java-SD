package com.gillout.trenteSixExercices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SalaireMedianOpenSpaceTest {
    private final SalaireMedianOpenSpace salaireMedianOpenSpace = new SalaireMedianOpenSpace();
    @DisplayName("Test de la méthode getMedianSalary si la taille de la liste est paire")
    @Test
    void doitRenvoyerLaMoyenneDesDeuxSalairesDuMilieuSiLaListeEstPaire() {
        // Given
        List<Integer> salaires = Arrays.asList(27000, 32000, 36000, 42000);
        int attendu = 34000;

        // When
        int actuel = salaireMedianOpenSpace.getMedianSalary(salaires);

        // Then
        assertThat(actuel).isEqualTo(attendu);
    }

    @DisplayName("Test de la méthode getMedianSalary si la taille de la liste est impaire")
    @Test
    void doitRenvoyerLeSalaireDuMilieuSiLaListeEstImpaire() {
        // Given
        List<Integer> salaires = Arrays.asList(27000, 35000, 42000);
        int attendu = 35000;

        // When
        int actuel = salaireMedianOpenSpace.getMedianSalary(salaires);

        // Then
        assertThat(actuel).isEqualTo(attendu);
    }

    @DisplayName("Test de la méthode getMedianSalary si la liste est vide ou nulle")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyer0SiLaListeEstVideOuNulle(List<Integer> salaires) {
        // Given
        int attendu = 0;

        // When
        int actuel = salaireMedianOpenSpace.getMedianSalary(salaires);

        // Then
        assertThat(actuel).isEqualTo(attendu);
    }
}
