package com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.dark

import android.content.Context
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIDynamicColorCodes
import com.androidai.framework.theme.sandroid.ui.data.SAndroidUIOtherColors

internal fun getDynamicDarkSAndroidUIOtherColors(context:Context) : SAndroidUIOtherColors {
    val dynamicColorCodes = SAndroidUIDynamicColorCodes(context)
    return   SAndroidUIOtherColors(
        accentColor = dynamicColorCodes.ColorAccentNight,
        badgeColor = dynamicColorCodes.ColorErrorNight,
        dividerColor = dynamicColorCodes.ColorLineNight,
        sideSheetDividerColor = dynamicColorCodes.ColorLineNight,
        bottomSheetDividerColor = dynamicColorCodes.ColorLineNight,
        progressIndicatorColor = dynamicColorCodes.ColorAccentNight,
        checkBoxUnSelectedColor = dynamicColorCodes.ColorCheckBoxButtonUnSelectedNight,
        chipBorderColor = dynamicColorCodes.ColorLineNight,
        radioUnSelectedColor = dynamicColorCodes.ColorRadioButtonUnSelectedNight,
        switchDisableTrackColor = dynamicColorCodes.ColorSwitchDisableTrackNight,
        switchDisableThumbColor = dynamicColorCodes.ColorSwitchDisableThumbNight,
        rippleColor = dynamicColorCodes.ColorRippleNight,
        checkBoxSelectedColor = dynamicColorCodes.ColorAccentNight,
        chipSelectedBorderColor = dynamicColorCodes.ColorAccentNight,
        radioSelectedColor = dynamicColorCodes.ColorAccentNight,
        switchEnableThumbColor = dynamicColorCodes.ColorAccentNight,
        switchEnableTrackColor = dynamicColorCodes.ColorAccentNight)
}