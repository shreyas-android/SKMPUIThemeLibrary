package com.androidai.framework.theme.sandroid.ui.default

import android.content.Context
import androidx.compose.ui.graphics.Color
import com.androidai.framework.theme.sandroid.ui.data.SAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.DefaultDarkSAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.DefaultLightSAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.getDefaultDynamicDarkSAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.theme.colors.getDefaultDynamicLightSAndroidUIColors

class SAndroidUIDefaults(
        private val context : Context,
        private val lightSAndroidUIColors : SAndroidUIColors = DefaultLightSAndroidUIColors,
        private val darkSAndroidUIColors : SAndroidUIColors = DefaultDarkSAndroidUIColors,
        private val dynamicLightSAndroidUIColors : SAndroidUIColors = getDefaultDynamicLightSAndroidUIColors(context),
        private val dynamicDarkSAndroidUIColors : SAndroidUIColors = getDefaultDynamicDarkSAndroidUIColors(context)) {

    fun getSAndroidUIColors(
            isNightMode : Boolean, isDynamicThemeEnabled : Boolean,
            actionColor : Color) : SAndroidUIColors {
        return if(isDynamicThemeEnabled) {
            if(isNightMode) {
                dynamicDarkSAndroidUIColors //.getActionColor(actionColor)
            } else {
                dynamicLightSAndroidUIColors //.getActionColor(actionColor)
            }
        } else {
            if(isNightMode) {
                darkSAndroidUIColors.getActionColor(actionColor)
            } else {
                lightSAndroidUIColors.getActionColor(actionColor)
            }
        }
    }
}