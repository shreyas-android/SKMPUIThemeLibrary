package com.androidai.framework.feature.sandroid.ui

import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import com.androidai.framework.theme.sandroid.ui.data.model.colors.SAndroidUIColors

/**
 * Maps a [SAndroidUIColors] palette onto the Material 2 [Colors] used by the components of this
 * screen (`Scaffold`, `Surface`, `Card`, `TopAppBar`, ...).
 *
 * Those components fall back to Material's default *light* palette for anything the caller does
 * not colour explicitly, which shows up as white surfaces and dark-on-dark content once the dark
 * palette is applied. Deriving the palette here keeps the white/light and the dark theme correct.
 */
internal fun SAndroidUIColors.toMaterialColors() : Colors {
    val backgroundColors = sAndroidUIBackgroundColors
    val textColors = sAndroidUITextColors
    val accentColor = sAndroidUIOtherColors.accentColor

    return if(isDark) {
        darkColors(
            primary = accentColor, primaryVariant = accentColor, secondary = accentColor,
            secondaryVariant = accentColor, background = backgroundColors.backgroundColor,
            surface = backgroundColors.cardBackgroundColor, error = textColors.errorTextColor,
            onPrimary = textColors.highlightTextColor, onSecondary = textColors.highlightTextColor,
            onBackground = textColors.primaryTextColor, onSurface = textColors.primaryTextColor,
            onError = textColors.highlightTextColor)
    } else {
        lightColors(
            primary = accentColor, primaryVariant = accentColor, secondary = accentColor,
            secondaryVariant = accentColor, background = backgroundColors.backgroundColor,
            surface = backgroundColors.cardBackgroundColor, error = textColors.errorTextColor,
            onPrimary = textColors.highlightTextColor, onSecondary = textColors.highlightTextColor,
            onBackground = textColors.primaryTextColor, onSurface = textColors.primaryTextColor,
            onError = textColors.highlightTextColor)
    }
}
