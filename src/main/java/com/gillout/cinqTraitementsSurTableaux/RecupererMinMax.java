package com.gillout.cinqTraitementsSurTableaux;

import java.util.Collections;
import java.util.List;

public class RecupererMinMax {
    public static Integer minValue(List<Integer> numberList) {
        return numberList.stream().min(Integer::compare).get();
    }

    public static Integer maxValue(List<Integer> numberList) {
        return Collections.max(numberList);
    }
}
