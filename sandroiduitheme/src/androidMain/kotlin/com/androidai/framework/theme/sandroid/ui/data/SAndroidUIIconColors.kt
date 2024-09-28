package com.androidai.framework.theme.sandroid.ui.data

import androidx.compose.ui.graphics.Color

data class SAndroidUIIconColors(
        val iconColor:Color,
        val topAppBarIconColor : Color, val bottomAppBarIconColor : Color,
        val bottomNavigationBarSelectedIconColor : Color,
        val bottomNavigationBarIconColor : Color,
        val buttonIconColor : Color,
        val fabIconColor : Color, val chipIconColor : Color, val menuIconColor : Color,
        val searchBarIconColor : Color, val bottomSheetIconColor : Color,
        val dragHandleColor : Color, val sideSheetIconColor : Color, val tabIconColor : Color,
){
    fun getActionColor(color : Color) : SAndroidUIIconColors {
        return copy(bottomNavigationBarSelectedIconColor = color)
    }
}