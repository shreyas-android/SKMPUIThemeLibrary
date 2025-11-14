package com.androidai.framework.theme.sandroid.ui.default

import androidx.compose.ui.graphics.Color
import com.androidai.framework.theme.sandroid.ui.colors.DefaultDarkSAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.colors.DefaultLightSAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.colors.getDefaultDynamicDarkSAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.colors.getDefaultDynamicLightSAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.data.model.colors.SAndroidUIColors

class SAndroidUIDefaults(
        private val lightSAndroidUIColors : SAndroidUIColors = DefaultLightSAndroidUIColors,
        private val darkSAndroidUIColors : SAndroidUIColors = DefaultDarkSAndroidUIColors,
        private val dynamicLightSAndroidUIColors : SAndroidUIColors = getDefaultDynamicLightSAndroidUIColors(),
        private val dynamicDarkSAndroidUIColors : SAndroidUIColors = getDefaultDynamicDarkSAndroidUIColors()) {

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