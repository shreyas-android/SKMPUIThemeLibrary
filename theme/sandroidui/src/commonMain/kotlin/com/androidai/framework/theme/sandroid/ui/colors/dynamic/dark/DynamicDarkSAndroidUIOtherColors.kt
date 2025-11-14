package com.androidai.framework.theme.sandroid.ui.colors.dynamic.dark

import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIDynamicColorCodes
import com.androidai.framework.theme.sandroid.ui.data.model.colors.SAndroidUIOtherColors

internal fun getDynamicDarkSAndroidUIOtherColors() : SAndroidUIOtherColors {
    val dynamicColorCodes = SAndroidUIDynamicColorCodes()
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