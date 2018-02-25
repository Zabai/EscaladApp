package helpers;

import java.util.ArrayList;
import model.Mountain;
import model.User;

public class UserHelper {
    public static boolean userHasFavouriteMountain(final User user, final int mountainId) {
        return user.getFavourites().stream()
                .filter(mountain -> mountain.getId()==mountainId)
                .findFirst().isPresent();
    }
}
