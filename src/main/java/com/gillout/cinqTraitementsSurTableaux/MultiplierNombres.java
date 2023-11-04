package com.gillout.cinqTraitementsSurTableaux;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

// 1. Multiplier par deux chaque nombre du tableau
public class MultiplierNombres {
    public List<Integer> doubleValue(List<Integer> numberList) {
        if (CollectionUtils.isEmpty(numberList)) {
            throw new RuntimeException("Liste invalide");
        }

        return numberList.stream().map(num -> num * 2).collect(Collectors.toList());
    }
}
