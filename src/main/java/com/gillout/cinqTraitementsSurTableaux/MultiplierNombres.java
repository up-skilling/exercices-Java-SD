package com.gillout.cinqTraitementsSurTableaux;

import java.util.List;
import java.util.stream.Collectors;

public class MultiplierNombres {
    public static List<Integer> doubleValue(List<Integer> numberList) {
        return numberList.stream().map(num -> num * 2).collect(Collectors.toList());
    }
}
