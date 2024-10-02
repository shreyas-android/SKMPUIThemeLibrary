package com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.dark

import android.content.Context
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIDynamicColorCodes
import com.androidai.framework.theme.sandroid.ui.data.SAndroidUITextColors

internal fun getDynamicDarkSAndroidUITextColors(context : Context) : SAndroidUITextColors {
    val dynamicColorCodes = SAndroidUIDynamicColorCodes(context)
    return  SAndroidUITextColors(
        primaryTextColor = dynamicColorCodes.ColorLabelTextNight,
        bottomNavigationTextColor = dynamicColorCodes.ColorLabelTextNight,
        buttonTextColor = dynamicColorCodes.ColorLabelTextNight,
        chipTextColor = dynamicColorCodes.ColorLabelTextNight,
        dialogDescriptionTextColor = dynamicColorCodes.ColorLabelDescriptionNight,
        disableTextColor = dynamicColorCodes.ColorLabelTextNight,
        linkTextColor = dynamicColorCodes.ColorAccentNight,
        topAppBarActionTextColor = dynamicColorCodes.ColorAppBarActionNight,
        topAppBarTextColor = dynamicColorCodes.ColorAppBarTitleNight,
        menuTextColor = dynamicColorCodes.ColorLabelTextNight,
        secondaryTextColor = dynamicColorCodes.ColorLabelDescriptionNight,
        searchBarTextColor = dynamicColorCodes.ColorLabelTextNight,
        searchBarHintColor = dynamicColorCodes.ColorHintNight,
        tertiaryTextColor = dynamicColorCodes.ColorHintNight,
        highlightTextColor = dynamicColorCodes.ColorTextHighLightNight,
        optionTextColor = dynamicColorCodes.ColorLabelTextNight,
        dialogTitleTextColor = dynamicColorCodes.ColorLabelTextNight,
        extendedFabTextColor = dynamicColorCodes.ColorLabelTextNight,
        hintColor = dynamicColorCodes.ColorHintNight,
        inverseTextColor = dynamicColorCodes.ColorHintNight,
        snackBarActionTextColor = dynamicColorCodes.ColorAccentNight,
        snackBarMessageTextColor = dynamicColorCodes.ColorLabelTextNight,
        dialogPositiveButtonTextColor = dynamicColorCodes.ColorAccentNight,
        dialogNegativeButtonTextColor = dynamicColorCodes.ColorAccentNight,
        errorTextColor = dynamicColorCodes.ColorError,
        selectedNavigationBarTextColor = dynamicColorCodes.ColorAccentNight)
}