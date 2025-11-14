package com.androidai.framework.theme.sandroid.ui.colors

import com.androidai.framework.theme.sandroid.ui.colors.defined.dark.DarkSAndroidUIBackgroundColors
import com.androidai.framework.theme.sandroid.ui.colors.defined.dark.DarkSAndroidUIIconColors
import com.androidai.framework.theme.sandroid.ui.colors.defined.dark.DarkSAndroidUIOtherColors
import com.androidai.framework.theme.sandroid.ui.colors.defined.dark.DarkSAndroidUITextColors
import com.androidai.framework.theme.sandroid.ui.colors.defined.light.LightSAndroidUIBackgroundColors
import com.androidai.framework.theme.sandroid.ui.colors.defined.light.LightSAndroidUIIconColors
import com.androidai.framework.theme.sandroid.ui.colors.defined.light.LightSAndroidUIOtherColors
import com.androidai.framework.theme.sandroid.ui.colors.defined.light.LightSAndroidUITextColors
import com.androidai.framework.theme.sandroid.ui.colors.dynamic.dark.getDynamicDarkSAndroidUIBackgroundColors
import com.androidai.framework.theme.sandroid.ui.colors.dynamic.dark.getDynamicDarkSAndroidUIIconColors
import com.androidai.framework.theme.sandroid.ui.colors.dynamic.dark.getDynamicDarkSAndroidUIOtherColors
import com.androidai.framework.theme.sandroid.ui.colors.dynamic.dark.getDynamicDarkSAndroidUITextColors
import com.androidai.framework.theme.sandroid.ui.colors.dynamic.light.getDynamicLightSAndroidUIBackgroundColors
import com.androidai.framework.theme.sandroid.ui.colors.dynamic.light.getDynamicLightSAndroidUIIconColors
import com.androidai.framework.theme.sandroid.ui.colors.dynamic.light.getDynamicLightSAndroidUIOtherColors
import com.androidai.framework.theme.sandroid.ui.colors.dynamic.light.getDynamicLightSAndroidUITextColors
import com.androidai.framework.theme.sandroid.ui.data.model.colors.SAndroidUIColors

val DefaultLightSAndroidUIColors = SAndroidUIColors(
    LightSAndroidUIBackgroundColors, LightSAndroidUIIconColors, LightSAndroidUITextColors,
    LightSAndroidUIOtherColors)

val DefaultDarkSAndroidUIColors = SAndroidUIColors(
    DarkSAndroidUIBackgroundColors, DarkSAndroidUIIconColors, DarkSAndroidUITextColors,
    DarkSAndroidUIOtherColors)

fun getDefaultDynamicLightSAndroidUIColors() = SAndroidUIColors(
    getDynamicLightSAndroidUIBackgroundColors(),
    getDynamicLightSAndroidUIIconColors(),
    getDynamicLightSAndroidUITextColors(),
    getDynamicLightSAndroidUIOtherColors())

fun getDefaultDynamicDarkSAndroidUIColors() = SAndroidUIColors(
    getDynamicDarkSAndroidUIBackgroundColors(),
    getDynamicDarkSAndroidUIIconColors(),
    getDynamicDarkSAndroidUITextColors(),
    getDynamicDarkSAndroidUIOtherColors())



internal val LocalSAndroidUIColors = androidx.compose.runtime.staticCompositionLocalOf {
    DefaultLightSAndroidUIColors
}