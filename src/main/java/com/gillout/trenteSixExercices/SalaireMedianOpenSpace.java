package com.gillout.trenteSixExercices;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class SalaireMedianOpenSpace {
    // 7. Les développeurs SENIORS gagnent-ils plus que vous ?
    // Vous devez calculer le salaire médian de votre open-space !
    // Si la liste contient un nombre pair de salaires,
    // vous devez renvoyer la moyenne des 2 salaires du milieu.
    // Si la liste contient un nombre impair de salaires,
    // vous devez renvoyer le salaire du milieu.
    // Tip : On assume que la liste est déjà dans l'ordre.
    // Exemple : [27000, 32000, 36000] => 32000]
    // Exemple : [27000, 32000, 36000, 40000] => 34000]
    public int getMedianSalary(List<Integer> salaryList) {
        if (CollectionUtils.isEmpty(salaryList)) {
            return 0;
        }

        int size = salaryList.size();
        int halfSize = size / 2;

        if (size % 2 == 0) {
            return (salaryList.get(halfSize - 1) + salaryList.get(halfSize)) / 2;
        } else {
            return salaryList.get(halfSize);
        }
    }
}
