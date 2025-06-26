package com.example.flash.data

import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes

data class Categories(
    @StyleRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)