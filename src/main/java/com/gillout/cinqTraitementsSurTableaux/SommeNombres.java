package com.gillout.cinqTraitementsSurTableaux;

import java.util.List;

public class SommeNombres {
    public static Integer numbersSumWithMap(List<Integer> numberList) {
        return numberList.stream().mapToInt(Integer::intValue).sum();
    }

    public static Integer numbersSumWithReduce(List<Integer> numberList) {
        return numberList.stream().reduce((x, y) -> x + y).get();
    }
}
