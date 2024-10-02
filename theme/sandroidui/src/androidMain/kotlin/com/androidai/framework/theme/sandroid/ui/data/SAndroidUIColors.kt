package com.androidai.framework.theme.sandroid.ui.data

import androidx.compose.ui.graphics.Color

data class SAndroidUIColors(
        val sAndroidUIBackgroundColors : SAndroidUIBackgroundColors,
        val sAndroidUIIconColors : SAndroidUIIconColors,
        val sAndroidUITextColors : SAndroidUITextColors,
        val sAndroidUIOtherColors : SAndroidUIOtherColors){

    fun getActionColor(color: Color) : SAndroidUIColors {
        return copy(
            sAndroidUIBackgroundColors = sAndroidUIBackgroundColors.getActionColor(color),
            sAndroidUIIconColors = sAndroidUIIconColors.getActionColor(color),
            sAndroidUITextColors = sAndroidUITextColors.getSelectedColor(color),
            sAndroidUIOtherColors = sAndroidUIOtherColors.getActionColor(color))
    }

}