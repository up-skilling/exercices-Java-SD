package com.gillout.cinqTraitementsSurTableaux;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

// 5. Y a t'il au moins un élément impair dans le tableau (retourner un booléen) ?
public class VerifierSiNombreImpair {
    public Boolean isThereOdd(List<Integer> numberList) {
        if (CollectionUtils.isEmpty(numberList)) {
            throw new RuntimeException("Liste invalide");
        }

        return numberList.stream().anyMatch(num -> num %2 == 1);
    }
}
