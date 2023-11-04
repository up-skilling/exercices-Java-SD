package com.gillout.trenteSixExercices.assureSecuriteVoyageurs;

import com.gillout.trenteSixExercices.utils.User;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class SecuriteVoyageurs {
    // 13. Plan vigipirate activé dans TOUS les aéroports de France.
    // Vous devez rapidement développé un nouveau système pour assurer la sécurité des voyageurs.
    // Retournez true seulment si tous les usagers sont "safe".
    // Exemples : [( name: 'John', safe: true )] => true
    // [userList] => false
    public boolean isUserListSafed(List<User> userList) {
        if (CollectionUtils.isEmpty(userList)) {
            throw new RuntimeException("Liste invalide");
        }

        for (User user : userList) {
            if (!user.isSafe()) {
                return false;
            }
        }

        return true;
    }
}
