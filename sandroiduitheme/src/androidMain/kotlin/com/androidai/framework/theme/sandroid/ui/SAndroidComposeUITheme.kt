package com.androidai.framework.theme.sandroid.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.collectAsState
import com.androidai.framework.theme.sandroid.ui.data.SAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.LocalSAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.thememanager.SAndroidUIThemeManager

@Composable
internal fun SAndroidUITheme(
        colors : SAndroidUIColors, content : @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalSAndroidUIColors provides colors, LocalRippleTheme provides SAndroidUIRippleTheme,
        content = content)
}

@Composable
fun SAndroidUITheme(themeManager : SAndroidUIThemeManager, content : @Composable () -> Unit) {
    val uiColors = themeManager.getSAndroidUIColorsFlow().collectAsState().value
    SAndroidUITheme(uiColors, content)
}

object SAndroidUITheme {

    val colors : SAndroidUIColors
        @Composable @ReadOnlyComposable get() = LocalSAndroidUIColors.current

}

@Immutable
private object SAndroidUIRippleTheme : RippleTheme {

    @Composable
    override fun defaultColor() =
        RippleTheme.defaultRippleColor(
            contentColor = SAndroidUITheme.colors.sAndroidUIOtherColors.rippleColor,
            lightTheme = !isSystemInDarkTheme())

    @Composable
    override fun rippleAlpha() =
        RippleTheme.defaultRippleAlpha(
            contentColor = SAndroidUITheme.colors.sAndroidUIOtherColors.rippleColor,
            lightTheme = !isSystemInDarkTheme())
}
