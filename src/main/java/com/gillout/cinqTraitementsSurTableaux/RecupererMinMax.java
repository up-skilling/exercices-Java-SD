package com.gillout.cinqTraitementsSurTableaux;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.List;

// 3. Récupérer la valeur maximum et la valeur minimum
public class RecupererMinMax {
    public Integer minValue(List<Integer> numberList) {
        if (CollectionUtils.isEmpty(numberList)) {
            throw new RuntimeException("Liste invalide");
        }

        return numberList.stream().min(Integer::compare).get();
    }

    public Integer maxValue(List<Integer> numberList) {
        if (CollectionUtils.isEmpty(numberList)) {
            throw new RuntimeException("Liste invalide");
        }

        return Collections.max(numberList);
    }
}
