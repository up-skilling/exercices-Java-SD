package com.gillout;

import com.gillout.cinqTraitementsSurTableaux.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Ces 5 exercices sont à faire sans utiliser de boucles (for, for..in, etc...)
        // mais plutôt en utilisant les méthodes map(), filter(), et reduce()
        List<Integer> someArr = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(MultiplierNombres.doubleValue(someArr));

        System.out.println(FiltrerPairsImpairs.evensFilter(someArr));
        System.out.println(FiltrerPairsImpairs.oddsFilter(someArr));

        System.out.println(RecupererMinMax.minValue(someArr));
        System.out.println(RecupererMinMax.maxValue(someArr));

        System.out.println(SommeNombres.numbersSumWithMap(someArr));
        System.out.println(SommeNombres.numbersSumWithReduce(someArr));

        System.out.println(VerifierSiNombreImpair.isThereOdd(someArr));
    }
}
