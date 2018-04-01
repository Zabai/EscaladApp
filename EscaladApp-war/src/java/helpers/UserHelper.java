package helpers;

import entities.User;

public class UserHelper {
    public static boolean userHasFavouriteMountain(final User user, final int mountainId) {
        return user.getFavouriteList().stream().filter((favourite) -> {
            return favourite.getMountain().getId() == mountainId;
        }).findFirst().isPresent();
    }
    
    public static boolean userHasClimbedMountain(final User user, final int mountainId) {
        return user.getClimbedList().stream().filter((climbed) -> {
            return climbed.getMountain().getId() == mountainId;
        }).findFirst().isPresent();
    }
}
