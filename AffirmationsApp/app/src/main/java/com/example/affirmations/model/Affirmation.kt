package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation (
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)


//Data classes are a type of class that only contain properties, they can provide some utility methods to work with those properties.
// The data class will be comprised of properties that represent the information relevant to what will be an "Affirmation," which will consist of a string resource and an image resource