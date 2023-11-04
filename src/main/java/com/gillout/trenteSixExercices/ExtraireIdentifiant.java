package com.gillout.trenteSixExercices;

public class ExtraireIdentifiant {
    // 11. Félicitations, vous venez d'être promu Tech Lead !
    // Malheureusement, un développeur junior vient de corrompre la base de données.
    // Et bien sûr, c'est vous qu'on appelle pour éteindre le feu.
    // Extraire le nombre de l'identifiant corrompu et l'incrémenter de 1.
    // Exemples : "abc1" => 2, "skKiuUE197" => 198
    public int extractId(String corruptedId) {
        if (corruptedId == null) {
            throw new RuntimeException("Chaîne invalide");
        }

        if (corruptedId.isEmpty()) {
            throw new RuntimeException("Aucun id trouvé");
        }

        StringBuilder stringId = new StringBuilder();

        for(int i = 0; i < corruptedId.length(); i++) {
            if (String.valueOf(corruptedId.charAt(i)).matches("[0-9]")) {
                stringId.append(corruptedId.charAt(i));
            }
        }

        return 1 + Integer.parseInt(stringId.toString());
    }
}
