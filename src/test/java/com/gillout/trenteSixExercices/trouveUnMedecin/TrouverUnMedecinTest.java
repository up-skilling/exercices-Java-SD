package com.gillout.trenteSixExercices.trouveUnMedecin;

import com.gillout.trenteSixExercices.utils.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TrouverUnMedecinTest {
    private final TrouverUnMedecin trouverUnMedecin = new TrouverUnMedecin();

    @DisplayName("Test de la méthode hasDoctor si un médecin est dans la foule")
    @Test
    void doitRenvoyerTrueSiUnDocteurEstDansLaFoule() {
        // Given
        List<User> users = List.of(
                new User ( "John", false, true ),
                new User ( "Joe", true, false ),
                new User ( "Jack", false, true )
        );
        // When
        boolean isDoctorPresent = trouverUnMedecin.hasDoctor(users);

        // Then
        assertTrue(isDoctorPresent);
    }

    @DisplayName("Test de la méthode hasDoctor si aucun médecin dans la foule")
    @Test
    void doitRenvoyerFalseSiAucunDocteurDansLaFoule() {
        // Given
        List<User> users = List.of(
                new User ( "John", false, true ),
                new User ( "Joe", false, false ),
                new User ( "Jack", false, true )
        );

        // When
        boolean isDoctorPresent = trouverUnMedecin.hasDoctor(users);

        // Then
        assertFalse(isDoctorPresent);
    }

    @DisplayName("Test de la méthode hasDoctor si personne autour")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerFalseSiPersonneAutour(List<User> users) {
        // When
        boolean isDoctorPresent = trouverUnMedecin.hasDoctor(users);

        // Then
        assertFalse(isDoctorPresent);
    }
}
