package com.androidai.framework.theme.sandroid.ui.data

import androidx.compose.ui.graphics.Color

data class SAndroidUIOtherColors(
        val accentColor : Color, val rippleColor : Color, val badgeColor : Color,
        val checkBoxUnSelectedColor : Color, val chipBorderColor : Color, val dividerColor : Color,
        val progressIndicatorColor : Color, val radioUnSelectedColor : Color,
        val sideSheetDividerColor : Color, val bottomSheetDividerColor : Color,
        val switchDisableTrackColor : Color, val switchDisableThumbColor : Color,
        val checkBoxSelectedColor : Color, val chipSelectedBorderColor : Color,
        val radioSelectedColor : Color, val switchEnableTrackColor : Color,
        val switchEnableThumbColor : Color) {

    fun getActionColor(color : Color) : SAndroidUIOtherColors {
        return copy(
            accentColor = color, rippleColor = color.copy(alpha = 0.4f),
            progressIndicatorColor = color,
            checkBoxSelectedColor = color, chipSelectedBorderColor = color,
            radioSelectedColor = color, switchEnableTrackColor = color,
            switchEnableThumbColor = color)
    }

}