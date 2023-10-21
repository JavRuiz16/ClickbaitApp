package com.example.clickbaitapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Cards(

    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

