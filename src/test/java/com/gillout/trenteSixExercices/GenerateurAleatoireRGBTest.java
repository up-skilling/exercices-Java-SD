package com.gillout.trenteSixExercices;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

class GenerateurAleatoireRGBTest {
    private final GenerateurAleatoireRGB generateurAleatoireRGB = new GenerateurAleatoireRGB();

    @DisplayName("Test de la méthode getRandomNumber")
    @Test
    void doitRenvoyerUnNombreEntreMinEtMax() {
        // Given
        int min = 0;
        int max = 255;
        boolean attendu = true;

        // When
        int actuel = generateurAleatoireRGB.getRandomNumber(min, max);

        // Then
        assertThat(actuel).isBetween(min, max);
    }

    @DisplayName("Test de la méthode generateRandomRGB")
    @Test
    void doitRenvoyerUneCouleurAleatoireRGB() {
        // Given
        Pattern rgbRegex = Pattern.compile("rgb\\(([0-9]+), ([0-9]+), ([0-9]+)*\\)");

        // When
        String actuel = generateurAleatoireRGB.generateRandomRGB();

        // Then
        assertThat(actuel).matches(rgbRegex);
    }
}
