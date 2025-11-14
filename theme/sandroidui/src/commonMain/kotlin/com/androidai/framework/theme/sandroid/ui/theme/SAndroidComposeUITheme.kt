package com.androidai.framework.theme.sandroid.ui.theme

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.material3.RippleConfiguration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.graphics.Color
import com.androidai.framework.theme.sandroid.ui.colors.LocalSAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.data.model.colors.SAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.thememanager.SAndroidUIThemeManager

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun SAndroidUITheme(
        colors : SAndroidUIColors, content : @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalSAndroidUIColors provides colors,
        LocalRippleConfiguration provides getRippleConfiguration(colors.sAndroidUIOtherColors.rippleColor),
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

@OptIn(ExperimentalMaterial3Api::class)
private fun getRippleConfiguration(contentColor: Color): RippleConfiguration {
    return RippleConfiguration(color = contentColor)
}

