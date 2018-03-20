function checkClimbed(user, mountainId) {
    user.climbed.forEach(function(mountain) {
        if(mountain.id === mountainId) {
            var climbedButton = document.getElementById("climbed");
            climbedButton.classList.remove("is-inverted");
        }
    });
}

function checkFavourite(user, mountainId) {
    user.favourites.forEach(function(mountain) {
        if(mountain.id === mountainId) {
            var favouriteButton = document.getElementById("favourite");
            favouriteButton.classList.remove("is-inverted");
        }
    });
}