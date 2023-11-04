package com.gillout.trenteSixExercices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ObesiteDesEnfantsTest {
    private final ObesiteDesEnfants obesiteDesEnfants = new ObesiteDesEnfants();

    @DisplayName("Test de la méthode weightLoss")
    @Test
    void doitRenvoyerUnTableauSansDoublon() {
        // Given
        List<String> treatList = List.of(
                "Twix", "Bounty", "Snikers", "Mars", "M&M's", "Twix", "Snikers"
        );
        List<String> attendu = List.of(
                "Twix", "Bounty", "Snikers", "Mars", "M&M's"
        );

        // When
        List<String> actuel = obesiteDesEnfants.weightLoss(treatList);

        // Then
        assertThat(actuel).containsExactlyInAnyOrderElementsOf(attendu);
        assertThat(actuel).hasSameSizeAs(attendu);
    }

    @DisplayName("Test de la méthode weightLoss si la liste est vide ou nulle")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerUneListeVideQuandLaListeEstVideOuNulle(List<String> treatList) {
        // When
        List<String> actuel = obesiteDesEnfants.weightLoss(treatList);

        // Then
        assertThat(actuel).isEmpty();
    }
}
