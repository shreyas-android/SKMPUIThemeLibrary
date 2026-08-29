package com.androidai.framework.theme.sandroid.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import com.androidai.framework.theme.sandroid.ui.data.model.colors.SAndroidUIColors

/**
 * Maps a [SAndroidUIColors] palette onto a Material 3 [ColorScheme].
 *
 * Material components that are not explicitly coloured by the caller (dialogs, menus, text
 * fields, surfaces, ...) read their colours from the [ColorScheme]. Without this mapping they
 * always fall back to Material's default *light* scheme, which makes them unreadable as soon
 * as the dark palette is applied. Deriving the scheme from the active palette keeps the
 * white/light and the dark themes consistent for both library and consumer components.
 */
fun SAndroidUIColors.toMaterialColorScheme() : ColorScheme {
    val backgroundColors = sAndroidUIBackgroundColors
    val textColors = sAndroidUITextColors
    val otherColors = sAndroidUIOtherColors

    return if(isDark) {
        darkColorScheme(
            primary = otherColors.accentColor, onPrimary = textColors.highlightTextColor,
            primaryContainer = otherColors.accentColor,
            onPrimaryContainer = textColors.highlightTextColor,
            secondary = otherColors.accentColor, onSecondary = textColors.highlightTextColor,
            secondaryContainer = backgroundColors.secondaryBackgroundColor,
            onSecondaryContainer = textColors.primaryTextColor,
            tertiary = otherColors.accentColor, onTertiary = textColors.highlightTextColor,
            background = backgroundColors.backgroundColor,
            onBackground = textColors.primaryTextColor,
            surface = backgroundColors.cardBackgroundColor,
            onSurface = textColors.primaryTextColor,
            surfaceVariant = backgroundColors.secondaryBackgroundColor,
            onSurfaceVariant = textColors.secondaryTextColor,
            surfaceTint = otherColors.accentColor,
            inverseSurface = textColors.primaryTextColor,
            inverseOnSurface = backgroundColors.backgroundColor,
            inversePrimary = otherColors.accentColor, error = textColors.errorTextColor,
            onError = textColors.highlightTextColor, outline = otherColors.dividerColor,
            outlineVariant = otherColors.dividerColor, scrim = backgroundColors.scrimColor)
    } else {
        lightColorScheme(
            primary = otherColors.accentColor, onPrimary = textColors.highlightTextColor,
            primaryContainer = otherColors.accentColor,
            onPrimaryContainer = textColors.highlightTextColor,
            secondary = otherColors.accentColor, onSecondary = textColors.highlightTextColor,
            secondaryContainer = backgroundColors.secondaryBackgroundColor,
            onSecondaryContainer = textColors.primaryTextColor,
            tertiary = otherColors.accentColor, onTertiary = textColors.highlightTextColor,
            background = backgroundColors.backgroundColor,
            onBackground = textColors.primaryTextColor,
            surface = backgroundColors.cardBackgroundColor,
            onSurface = textColors.primaryTextColor,
            surfaceVariant = backgroundColors.secondaryBackgroundColor,
            onSurfaceVariant = textColors.secondaryTextColor,
            surfaceTint = otherColors.accentColor,
            inverseSurface = textColors.primaryTextColor,
            inverseOnSurface = backgroundColors.backgroundColor,
            inversePrimary = otherColors.accentColor, error = textColors.errorTextColor,
            onError = textColors.highlightTextColor, outline = otherColors.dividerColor,
            outlineVariant = otherColors.dividerColor, scrim = backgroundColors.scrimColor)
    }
}
