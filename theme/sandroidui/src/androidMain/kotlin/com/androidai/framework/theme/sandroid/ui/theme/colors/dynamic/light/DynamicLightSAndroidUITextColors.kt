package com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.light

import android.content.Context
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIDynamicColorCodes
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIDynamicTonalPalette
import com.androidai.framework.theme.sandroid.ui.data.SAndroidUITextColors

internal fun getDynamicLightSAndroidUITextColors(context : Context) : SAndroidUITextColors {
    val dynamicColorCodes = SAndroidUIDynamicColorCodes(context)
    return SAndroidUITextColors(
        primaryTextColor = dynamicColorCodes.ColorLabelText,
        bottomNavigationTextColor = dynamicColorCodes.ColorLabelText,
        buttonTextColor = dynamicColorCodes.ColorLabelText,
        chipTextColor = dynamicColorCodes.ColorLabelText,
        dialogDescriptionTextColor = dynamicColorCodes.ColorLabelDescription,
        disableTextColor = dynamicColorCodes.ColorLabelText,
        linkTextColor = dynamicColorCodes.ColorAccent,
        topAppBarActionTextColor = dynamicColorCodes.ColorAppBarAction,
        topAppBarTextColor = dynamicColorCodes.ColorAppBarTitle,
        menuTextColor = dynamicColorCodes.ColorLabelText,
        secondaryTextColor = dynamicColorCodes.ColorLabelDescription,
        searchBarTextColor = dynamicColorCodes.ColorLabelText,
        searchBarHintColor = dynamicColorCodes.ColorHint,
        tertiaryTextColor = dynamicColorCodes.ColorHint,
        highlightTextColor = dynamicColorCodes.ColorTextHighLight,
        optionTextColor = dynamicColorCodes.ColorLabelText,
        dialogTitleTextColor = dynamicColorCodes.ColorLabelText,
        extendedFabTextColor = dynamicColorCodes.ColorLabelText,
        hintColor = dynamicColorCodes.ColorHint,
        inverseTextColor = dynamicColorCodes.ColorHint,
        snackBarActionTextColor = dynamicColorCodes.ColorAccent,
        snackBarMessageTextColor = dynamicColorCodes.ColorLabelText,
        dialogPositiveButtonTextColor = dynamicColorCodes.ColorAccent,
        dialogNegativeButtonTextColor = dynamicColorCodes.ColorAccent,
        errorTextColor = dynamicColorCodes.ColorError,
        selectedNavigationBarTextColor = dynamicColorCodes.ColorAccent)
}