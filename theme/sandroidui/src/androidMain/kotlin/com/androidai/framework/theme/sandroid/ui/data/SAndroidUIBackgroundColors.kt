package com.androidai.framework.theme.sandroid.ui.data

import androidx.compose.ui.graphics.Color

data class SAndroidUIBackgroundColors(
        val backgroundColor : Color, val secondaryBackgroundColor : Color,
        val topAppBarColor : Color, val bottomAppBarColor : Color,
        val dialogBackgroundColor : Color, val bottomSheetBackgroundColor : Color,
        val bottomNavigationBarColor : Color, val cardBackgroundColor : Color,
        val buttonBackgroundColor : Color, val fabBackgroundColor : Color,
        val chipBackgroundColor : Color,
        val menuBackgroundColor : Color, val searchBarBackgroundColor : Color,
        val sideSheetBackgroundColor : Color, val snackBarBackgroundColor : Color,
        val scrimColor:Color,
        val chipSelectedBackgroundColor : Color,
        val tabBackgroundColor : Color, val selectedTabBackgroundColor : Color){

    fun getActionColor(color : Color) : SAndroidUIBackgroundColors {
        return copy(chipSelectedBackgroundColor = color, selectedTabBackgroundColor = color)
    }
}