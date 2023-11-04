package com.gillout.trenteSixExercices.calculMoyenneSalaires;

import com.gillout.trenteSixExercices.utils.Employe;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class MoyenneSalaires {
    // 4. Créer un calculateur de moyenne des salaires dans une entreprise.
    // La valeur de retour doit être un nombre entier,
    // arrondi à l'inférieur le plus proche.
    // Résultat attendu : 42833.
    public Integer computeAverage(List<Employe> employes) {
        if (CollectionUtils.isEmpty(employes)) {
            throw new RuntimeException("Liste invalide");
        }

        if (employes.size() == 1) {
            return Integer.parseInt(employes.get(0).getIncome());
        }

        int sumSalary = employes.stream().mapToInt(employe -> Integer.parseInt(employe.getIncome())).sum();

        return (int) Math.floor((double) sumSalary / employes.size());
    }
}
