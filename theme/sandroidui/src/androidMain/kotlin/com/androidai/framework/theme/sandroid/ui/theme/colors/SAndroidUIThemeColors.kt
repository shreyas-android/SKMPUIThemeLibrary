package com.androidai.framework.theme.sandroid.ui.theme.colors

import android.content.Context
import com.androidai.framework.theme.sandroid.ui.data.SAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.defined.dark.DarkSAndroidUIBackgroundColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.defined.dark.DarkSAndroidUIIconColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.defined.dark.DarkSAndroidUIOtherColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.defined.dark.DarkSAndroidUITextColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.dark.getDynamicDarkSAndroidUIIconColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.dark.getDynamicDarkSAndroidUIOtherColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.defined.light.LightSAndroidUIBackgroundColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.defined.light.LightSAndroidUIIconColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.defined.light.LightSAndroidUIOtherColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.defined.light.LightSAndroidUITextColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.light.getDynamicLightSAndroidUIBackgroundColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.light.getDynamicLightSAndroidUIIconColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.light.getDynamicLightSAndroidUIOtherColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.dark.getDynamicDarkSAndroidUIBackgroundColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.dark.getDynamicDarkSAndroidUITextColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.light.getDynamicLightSAndroidUITextColors

val DefaultLightSAndroidUIColors = SAndroidUIColors(
    LightSAndroidUIBackgroundColors, LightSAndroidUIIconColors, LightSAndroidUITextColors,
    LightSAndroidUIOtherColors)

val DefaultDarkSAndroidUIColors = SAndroidUIColors(
    DarkSAndroidUIBackgroundColors, DarkSAndroidUIIconColors, DarkSAndroidUITextColors,
    DarkSAndroidUIOtherColors)

fun getDefaultDynamicLightSAndroidUIColors(context : Context) = SAndroidUIColors(
    getDynamicLightSAndroidUIBackgroundColors(context), getDynamicLightSAndroidUIIconColors(context),
    getDynamicLightSAndroidUITextColors(context),
    getDynamicLightSAndroidUIOtherColors(context))

fun getDefaultDynamicDarkSAndroidUIColors(context : Context) = SAndroidUIColors(
    getDynamicDarkSAndroidUIBackgroundColors(context), getDynamicDarkSAndroidUIIconColors(context),
    getDynamicDarkSAndroidUITextColors(context),
    getDynamicDarkSAndroidUIOtherColors(context))



internal val LocalSAndroidUIColors = androidx.compose.runtime.staticCompositionLocalOf {
    DefaultLightSAndroidUIColors
}