function checkClimbed(user, mountainId) {
    user.climbedList.forEach(function(climbed) {
        if(climbed.mountain.id === mountainId) {
            var climbedButton = document.getElementById("climbed");
            climbedButton.classList.remove("is-inverted");
        }
    });
}

function checkFavourite(user, mountainId) {
    user.favouriteList.forEach(function(favourite) {
        if(favourite.mountain.id === mountainId) {
            var favouriteButton = document.getElementById("favourite");
            favouriteButton.classList.remove("is-inverted");
        }
    });
}