package com.gillout.trenteSixExercices;

public class NombreEnSecondes {
    // 5. Vous devez convertir un nombre de secondes
    // en une chaîne de caractères "minutes:secondes"
    // Exemples : 325 => "5:25", 4 => "0:4", 60 => "1:0"
    public String secondToMin(int seconds) {
        if (seconds < 0) {
            throw new RuntimeException("Nombre invalide");
        }

        if (seconds == 0) {
            return "0:00";
        }

        int secondsRemaining = seconds % 60;
        int minutes = (seconds - secondsRemaining) / 60;

        return String.valueOf(minutes) + ':' + secondsRemaining;
    }
}
