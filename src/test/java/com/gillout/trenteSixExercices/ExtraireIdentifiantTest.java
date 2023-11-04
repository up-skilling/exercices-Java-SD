package com.gillout.trenteSixExercices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraireIdentifiantTest {
    private final ExtraireIdentifiant extraireIdentifiant = new ExtraireIdentifiant();

    @DisplayName("Test de la méthode extractId")
    @Test
    void doitRenvoyerLeNombreDeLIdentifiantPlusUn() {
        // Given
        String idCorrompu = "skKiuUE197";
        int attendu = 198;

        // When
        int actuel = extraireIdentifiant.extractId(idCorrompu);

        // Then
        assertEquals(attendu, actuel);
    }

    @DisplayName("Test de la méthode extractId si la chaîne est vide")
    @Test
    void doitRenvoyerUneExceptionSiVide() {
        // Given
        String idCorrompu = "";
        String messageAttendu = "Aucun id trouvé";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () ->
                extraireIdentifiant.extractId(idCorrompu));
        String messageActuel = actuel.getMessage();
        assertTrue(messageActuel.contains(messageAttendu));
    }

    @DisplayName("Test de la méthode extractId si la chaîne est nulle")
    @Test
    void doitRenvoyerUneExceptionSiNull() {
        // Given
        String idCorrompu = null;
        String messageAttendu = "Chaîne invalide";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () ->
                extraireIdentifiant.extractId(idCorrompu));
        String messageActuel = actuel.getMessage();
        assertTrue(messageActuel.contains(messageAttendu));
    }
}
