package com.gillout.trenteSixExercices;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class DetecterMontantsExtorques {
    // 8. Une grande banque américaine vous charge de détecter le montant exacte extorqué
    // par 2 arnaqueurs dans un flux financier récent...
    // Ces arnaqueurs détournent des petites sommes dans des flux plus importants !
    // Retourner la somme des deux plus petits montant d'un tableau.
    // Exemples : [1, 1000, 2, 2000] => 3, [190, 5, 4200, 2, 776] => 7
    public Integer sumTwoSmallestNumbers(List<Integer> numbers) {
        if (CollectionUtils.isEmpty(numbers)) {
            throw new RuntimeException("Liste invalide");
        }
        if (numbers.size() == 1) {
            return numbers.get(0);
        }
        List<Integer> nums = numbers.stream().sorted().toList();

        return nums.get(0) + nums.get(1);
    }
}
