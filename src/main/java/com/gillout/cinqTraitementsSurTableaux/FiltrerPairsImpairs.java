package com.gillout.cinqTraitementsSurTableaux;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

// 2. Filtrer les élements qui sont pairs (even) et impairs (odd)
public class FiltrerPairsImpairs {
    public List<Integer> evensFilter(List<Integer> numberList) {
        if (CollectionUtils.isEmpty(numberList)) {
            throw new RuntimeException("Liste invalide");
        }

        return numberList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> oddsFilter(List<Integer> numberList) {
        if (CollectionUtils.isEmpty(numberList)) {
            throw new RuntimeException("Liste invalide");
        }

        return numberList.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());
    }
}
