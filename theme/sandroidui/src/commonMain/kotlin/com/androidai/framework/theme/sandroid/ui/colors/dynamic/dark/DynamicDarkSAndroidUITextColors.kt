package com.androidai.framework.theme.sandroid.ui.colors.dynamic.dark

import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIDynamicColorCodes
import com.androidai.framework.theme.sandroid.ui.data.model.colors.SAndroidUITextColors

internal fun getDynamicDarkSAndroidUITextColors() : SAndroidUITextColors {
    val dynamicColorCodes = SAndroidUIDynamicColorCodes()
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