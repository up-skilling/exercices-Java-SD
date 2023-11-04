package com.gillout.trenteSixExercices;

import java.util.ArrayList;
import java.util.List;

public class NombreEnTableau {
    // 2. Transformer un simple nombre en tableau,
    // contenant chaque chiffre dans l'ordre inverse :
    // (Exemple : 348597 => [7, 9, 5, 8, 4, 3])
    public List<Integer> reverse(int num) {
        if (num < 0) {
            throw new RuntimeException("Nombre invalide");
        }

        List<Integer> arr = new ArrayList<>();
        String numString = String.valueOf(num);

        for(int i = numString.length() - 1; i >= 0; i--) {
            arr.add(Integer.parseInt(String.valueOf(numString.charAt(i))));
        }
        return arr;
    }
}
