package com.gillout.trenteSixExercices.assureSecuriteVoyageurs;

import com.gillout.trenteSixExercices.utils.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SecuriteVoyageursTest {
    private final SecuriteVoyageurs securiteVoyageurs = new SecuriteVoyageurs();

    @DisplayName("Test de la méthode isUserListSafed si tous les utilisateurs sont safe")
    @Test
    void doitRenvoyerTrueSiTousLesUtilisateursSontSafe() {
        // Given
        List<User> users = List.of(
                new User( "John", false, true ),
                new User ( "Joe", true, false ),
                new User ( "Jack", false, true )
        );

        // When
        boolean actuel = securiteVoyageurs.isUserListSafed(users);

        // Then
        assertThat(actuel).isTrue();
    }

    @DisplayName("Test de la méthode isUserListSafed si au moins un utilisateur n'est pas safe")
    @Test
    void doitRenvoyerFalseSiAuMoinsUnUtilisateurNEstPasSafe() {
        // Given
        List<User> users = List.of(
                new User( "John", false, true ),
                new User ( "Joe", true, false ),
                new User ( "Jack", false, true )
        );

        // When
        boolean actuel = securiteVoyageurs.isUserListSafed(users);

        // Then
        assertThat(actuel).isFalse();
    }

    @DisplayName("Test de la méthode isUserListSafed si la liste est vide ou nulle")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerUneExceptionSiLaListeEstVideOuNulle(List<User> users) {
        // Given
        String messageAttendu = "Liste invalide";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> securiteVoyageurs.isUserListSafed(users));
        String messageActuel = actuel.getMessage();
        assertThat(messageActuel).isEqualTo(messageAttendu);
    }
}
