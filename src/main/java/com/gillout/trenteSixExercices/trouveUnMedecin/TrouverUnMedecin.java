package com.gillout.trenteSixExercices.trouveUnMedecin;

import com.gillout.trenteSixExercices.utils.User;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class TrouverUnMedecin {
    // 14. Une jeune femme vient de se faire renverser devant vous par un chauffard ivre qui roulait à 180km/h
    // Vous n'avez que quelques minutes pour tenter de la sauver.
    // Vous devez trouver un médecin dans les minutes qui suivent, sinon il faudra appeler les pompiers.
    // Retourner "true" si un médecin se trouve dans la foule.
    // Retourner "false" sinon, ou s'il n'y a personne autour de vous.
    // Vous n'avez le droit ni à "for", ni à "if"
    // Exemples : [] => false, [(name: "John", isDoctor: false), (name: "Jack", isDoctor: true)] => true
    public boolean hasDoctor(List<User> userList) {
        /*
        if (CollectionUtils.isEmpty(userList)) {
            return false;
        }
        return userList.stream().anyMatch(User::isDoctor);
        */

        return CollectionUtils.isEmpty(userList) ? false : userList.stream().anyMatch(User::isDoctor);

//        return !CollectionUtils.isEmpty(userList) && userList.stream().anyMatch(User::isDoctor);
    }
}
