package com.example.flash.data

import android.annotation.SuppressLint
import com.example.flash.R

object DataSource {

    @SuppressLint("ResourceType")
    fun loadCategories(): List<Categories> {
        return listOf(
            Categories(
                stringResourceId = R.string.fresh_fruits,
                imageResourceId = R.drawable.fruits
            ),
            Categories(R.string.bath_body, R.drawable.bathbody),
            Categories(R.string.bread_biscuits, R.drawable.biscuits),
            Categories(R.string.kitchen_essentials, R.drawable.kitchen),
            Categories(R.string.munchies, R.drawable.munchies),
            Categories(R.string.packaged_food, R.drawable.packing),
            Categories(R.string.Stationary, R.drawable.stationary),
            Categories(R.string.pet_food, R.drawable.dog),
            Categories(R.string.sweet_tooth, R.drawable.teeth),
            Categories(R.string.vegetables, R.drawable.veg),
            Categories(R.string.beverages, R.drawable.beverages),
        )
    }

}



















