package com.gillout.trenteSixExercices;

public class CalculPerformancePatrimoine {
    // 12. Mr. & Mme Wayne vous charge de créer un calculateur de performance pour leur patrimoine.
    // Ils aimeraient savoir combien d'année attendre pour atteindre 1 Million d'Euros.
    // Avant de leguer cet argent à leur fils Bruce.
    // Calculer le nombre d'année à attendre avant d'atteindre 1000000€
    // "currentCash" est la somme de départ.
    // "interest est le pourcentage d'intérêt gagné par an.
    // "tax" est le pourcentage de taxe qui s'applique sur les gains UNIQUEMENT.
    // Exemples : currentCash = 10000 / interest = 1.1 / tax = 0.4
    // => YEAR 1 : 1000€ + (10% × 1000€) * (1 - 0.5) => 1550.0€
    // => YEAR 2 : 1550.0€ + (10% x 1550.0€) * (1 - 0.5) => 2402.5€
    // ...
    // => YEAR 11 : 1240615.47€
    // Le résultat attendu est donc 16 années.
    public final static double INTEREST = 1.1;
    public final static double TAX = 0.5;
    public final static double MAX = 1000000;

    public int calculateYears(double currentCash) {
        if (currentCash == 0) {
            throw new RuntimeException("Montant de départ insuffisant");
        }

        double result = currentCash;
        int years = 0;

        while (result < MAX) {
            result = Math.floor(result) + (INTEREST * result) * (1 - TAX);
            years += 1;
        }

        return years;
    }
}
