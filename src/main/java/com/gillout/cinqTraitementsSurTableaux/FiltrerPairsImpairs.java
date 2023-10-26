package com.gillout.cinqTraitementsSurTableaux;

import java.util.List;
import java.util.stream.Collectors;

public class FiltrerPairsImpairs {
    public static List<Integer> evensFilter(List<Integer> numberList) {
        return numberList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
    }

    public static List<Integer> oddsFilter(List<Integer> numberList) {
        return numberList.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());
    }
}
