package com.androidai.framework.theme.sandroid.ui.data

import androidx.compose.ui.graphics.Color

data class SAndroidUITextColors(
        val primaryTextColor : Color, val secondaryTextColor : Color, val tertiaryTextColor : Color,
        val hintColor : Color, val highlightTextColor : Color, val linkTextColor : Color,
        val buttonTextColor : Color, val errorTextColor : Color, val disableTextColor : Color,
        val inverseTextColor : Color, val dialogTitleTextColor : Color,
        val dialogDescriptionTextColor : Color, val dialogPositiveButtonTextColor : Color,
        val dialogNegativeButtonTextColor : Color, val topAppBarTextColor : Color,
        val topAppBarActionTextColor : Color, val snackBarMessageTextColor : Color,
        val extendedFabTextColor : Color, val bottomNavigationTextColor : Color,
        val chipTextColor : Color, val menuTextColor : Color, val searchBarHintColor : Color,
        val searchBarTextColor : Color, val snackBarActionTextColor : Color,
        val selectedNavigationBarTextColor:Color,
        val optionTextColor : Color){

    fun getSelectedColor(color:Color) : SAndroidUITextColors {
        return copy(snackBarActionTextColor = color, dialogPositiveButtonTextColor = color,
            selectedNavigationBarTextColor = color)
    }
}