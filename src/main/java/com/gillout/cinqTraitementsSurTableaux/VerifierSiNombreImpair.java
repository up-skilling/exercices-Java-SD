package com.gillout.cinqTraitementsSurTableaux;

import java.util.List;

public class VerifierSiNombreImpair {
    public static Boolean isThereOdd(List<Integer> numberList) {
        return numberList.stream().anyMatch(num -> num %2 == 1);
    }
}
