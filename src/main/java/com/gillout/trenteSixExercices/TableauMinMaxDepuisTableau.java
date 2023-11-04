package com.gillout.trenteSixExercices;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TableauMinMaxDepuisTableau {
    // 10. Votre meilleur pote John Doe a une idée géniale pour faire de l'argent rapidement.
    // Acheter des objets au meilleur prix sur une brocante en ligne...
    // Puis les revendre à un prix plus élevé. Simple mais efficace.
    // Pourriez-vous calculer tout ça automatiquement pour votre pote John ?
    // Après tout... vous lui devez bien ça !
    // Retourner un tableau [min, max] depuis un autre tableau de nombres.
    // Exemples : [1, 2, 3] => [1, 3], [1, 4, 5, 19, 21, 2] => [1, 21]
    public List<Integer> minMax (List<Integer> priceList) {
        if (CollectionUtils.isEmpty(priceList)) {
            throw new RuntimeException("Le tableau est vide ou null");
        }

        if (priceList.size() == 1) {
            throw new RuntimeException("Le tableau ne contient qu'une valeur");
        }

        List <Integer> minMaxArr = new ArrayList<>();

        minMaxArr.add(Collections.min(priceList));
        minMaxArr.add(Collections.max(priceList));

        return minMaxArr;
    }
}
