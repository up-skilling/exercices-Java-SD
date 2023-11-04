package com.gillout.trenteSixExercices.calculMoyenneSalaires;

import com.gillout.trenteSixExercices.utils.Employe;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MoyenneSalairesTest {
    private final MoyenneSalaires moyenneSalaires = new MoyenneSalaires();

    @DisplayName("Test de la méthode computeAverage")
    @Test
    void doitRenvoyerLaMoyenneDesSalaires() {
        // Given
        List<Employe> employes = List.of(
            new Employe("John", "32500"),
            new Employe("Joe", "54000"),
            new Employe("James", "42000")
        );
        int attendu = 42833;

        // When
        int actuel = moyenneSalaires.computeAverage(employes);

        // Then
        assertThat(actuel).isEqualTo(attendu);
    }

    @DisplayName("Test de la méthode computeAverage si la liste ne contient qu'un seul salarié")
    @Test
    void doitRenvoyerLeSalaireDuSeulSalariePresent() {
        // Given
        List<Employe> employes = List.of(
            new Employe("James", "42000")
        );
        int attendu = 42000;

        // When
        int actuel = moyenneSalaires.computeAverage(employes);

        // Then
        assertThat(actuel).isEqualTo(attendu);
    }

    @DisplayName("Test de la méthode computeAverage si la liste est vide ou nulle")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerUneExceptionSiVideOuNull(List<Employe> employes) {
        // Given
        String messageAttendu = "Liste invalide";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> moyenneSalaires.computeAverage(employes));
        String messageActuel = actuel.getMessage();
        assertTrue(messageActuel.contains(messageAttendu));
    }
}
