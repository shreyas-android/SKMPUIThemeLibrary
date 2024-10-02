package com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.light

import android.content.Context
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIDynamicColorCodes
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIDynamicTonalPalette
import com.androidai.framework.theme.sandroid.ui.data.SAndroidUIOtherColors

internal fun getDynamicLightSAndroidUIOtherColors(context : Context) : SAndroidUIOtherColors {
    val dynamicColorCodes = SAndroidUIDynamicColorCodes(context)
    return SAndroidUIOtherColors(
        accentColor = dynamicColorCodes.ColorAccent,
        badgeColor = dynamicColorCodes.ColorError,
        dividerColor = dynamicColorCodes.ColorLine,
        sideSheetDividerColor = dynamicColorCodes.ColorLine,
        bottomSheetDividerColor = dynamicColorCodes.ColorLine,
        progressIndicatorColor = dynamicColorCodes.ColorAccent,
        checkBoxUnSelectedColor = dynamicColorCodes.ColorCheckBoxButtonUnSelected,
        chipBorderColor = dynamicColorCodes.ColorLine,
        radioUnSelectedColor = dynamicColorCodes.ColorRadioButtonUnSelected,
        switchDisableTrackColor = dynamicColorCodes.ColorSwitchDisableTrack,
        switchDisableThumbColor = dynamicColorCodes.ColorSwitchDisableThumb,
        rippleColor = dynamicColorCodes.ColorRipple,
        checkBoxSelectedColor = dynamicColorCodes.ColorAccent,
        chipSelectedBorderColor = dynamicColorCodes.ColorAccent,
        radioSelectedColor = dynamicColorCodes.ColorAccent,
        switchEnableThumbColor = dynamicColorCodes.ColorAccent,
        switchEnableTrackColor = dynamicColorCodes.ColorAccent)
}