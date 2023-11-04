package com.gillout.cinqTraitementsSurTableaux;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SommeNombresTest {
    private final SommeNombres sommeNombres = new SommeNombres();
    @DisplayName("Test de la méthode numbersSumWithMap")
    @Test
    void doitRenvoyerLaSommeDesValeurs() {
        // Given
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);
        Integer attendu = 33;

        // When
        Integer actuel = sommeNombres.numbersSumWithMap(nombres);

        // Then
        assertNotNull(actuel);
        assertEquals(attendu, actuel);
    }

    @DisplayName("Test de la méthode numbersSumWithMap si le tableau est vide ou null")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerUneExceptionSiVideOuNullAvecMap(List<Integer> nombres) {
        // Given
        String messageAttendu = "Liste invalide";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> sommeNombres.numbersSumWithMap(nombres));
        String messageActuel = actuel.getMessage();
        assertTrue(messageActuel.contains(messageAttendu));
    }

    @DisplayName("Test de la méthode numbersSumWithReduce")
    @Test
    void doitEgalementRenvoyerLaSommeDesValeurs() {
        // Given
        List<Integer> nombres = Arrays.asList(1, 2, 5, 10, 15);
        Integer attendu = 33;

        // When
        Integer actuel = sommeNombres.numbersSumWithReduce(nombres);

        // Then
        assertNotNull(actuel);
        assertEquals(attendu, actuel);
    }

    @DisplayName("Test de la méthode numbersSumWithReduce si le tableau est vide ou null")
    @ParameterizedTest
    @NullAndEmptySource
    void doitRenvoyerUneExceptionSiVideOuNullAvecReduce(List<Integer> nombres) {
        // Given
        String messageAttendu = "Liste invalide";

        // When and Then
        Exception actuel = assertThrows(RuntimeException.class, () -> sommeNombres.numbersSumWithReduce(nombres));
        String messageActuel = actuel.getMessage();
        assertTrue(messageActuel.contains(messageAttendu));
    }
}
