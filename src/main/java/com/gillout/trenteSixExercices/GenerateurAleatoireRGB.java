package com.gillout.trenteSixExercices;

public class GenerateurAleatoireRGB {
    // 3. Créer un générateur de couleur aléatoire au format RGB.
    // La valeur de retour doit être une chaîne de caractères.
    // Exemple : generateRandomRGB() => "rgb(60, 224, 136)"
    public int getRandomNumber(int min, int max) {
        if (min < 0 || max < 0) {
            return 0;
        }

        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public String generateRandomRGB() {
        int red = getRandomNumber(0, 255);
        int green = getRandomNumber(0, 255);
        int blue = getRandomNumber(0, 255);

        return "rgb(" + red + ", " + green + ", " + blue + ")";
    }
}
