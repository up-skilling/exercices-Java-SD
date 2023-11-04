package com.gillout.cinqTraitementsSurTableaux;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

// 4. Effectuer la somme de tous les éléments du tableau
public class SommeNombres {
    public Integer numbersSumWithMap(List<Integer> numberList) {
        if (CollectionUtils.isEmpty(numberList)) {
            throw new RuntimeException("Liste invalide");
        }

        return numberList.stream().mapToInt(Integer::intValue).sum();
    }

    public Integer numbersSumWithReduce(List<Integer> numberList) {
        if (CollectionUtils.isEmpty(numberList)) {
            throw new RuntimeException("Liste invalide");
        }

        return numberList.stream().reduce((x, y) -> x + y).get();
    }
}
