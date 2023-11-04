package com.gillout.trenteSixExercices;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ObesiteDesEnfants {
    // 6. Vous devez lutter contre l'obésité des enfants.
    // Retirer toutes les gourmandises en double dans la liste
    // Vous devez retourner un tableau dont chaque valeur doit être unique.
    // Exemple : ["Twix", "Twix"] => ["Twix"]
    // Exemple : ["Mars", "Bounty"] => ["Mars", "Bounty"]
    public List<String> weightLoss(List<String> treatList) {
        if (CollectionUtils.isEmpty(treatList)) {
            return Collections.emptyList();
        }

        return new HashSet<>(treatList).stream().toList();
    }
}
