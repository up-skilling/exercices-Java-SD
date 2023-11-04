package com.gillout.trenteSixExercices;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TrierChainesParLongueur {
    // 9. L'université de Harvard vous a chargé de créer un script pour trier les titres
    // des livres de leur bibliothèque par ordre croissant de longueur
    // Retourner un tableau de chaînes de caractères trié par ordre de longueur croissant.
    // (On suppose que le tableau d'entrée ne contient que des chaines de caractères.)
    // Exemples : ["un", "trois", "dix", "deux"] => ["un", "dix", "deux", "trois"],
    // ["Télescopes", "Lunettes", "Yeux"] => ["Yeux", "Lunettes", "Télescopes"]
    public List<String> sortStringAscending(List<String> itemList) {
        if (itemList == null || itemList.isEmpty()) {
            return new ArrayList<>();
        }

        return itemList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }
}
