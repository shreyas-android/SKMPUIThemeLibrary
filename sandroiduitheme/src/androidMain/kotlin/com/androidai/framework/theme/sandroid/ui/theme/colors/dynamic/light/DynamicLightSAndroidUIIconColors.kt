package com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.light

import android.content.Context
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIDynamicColorCodes
import com.androidai.framework.theme.sandroid.ui.data.SAndroidUIIconColors

internal fun getDynamicLightSAndroidUIIconColors(context : Context) : SAndroidUIIconColors {
    val dynamicColorCodes = SAndroidUIDynamicColorCodes(context)
    return  SAndroidUIIconColors(
        iconColor = dynamicColorCodes.ColorIcon, tabIconColor = dynamicColorCodes.ColorIcon,
        topAppBarIconColor = dynamicColorCodes.ColorAppBarIcon,
        bottomAppBarIconColor = dynamicColorCodes.ColorAppBarIcon,
        fabIconColor = dynamicColorCodes.ColorFabIcon,
        bottomSheetIconColor = dynamicColorCodes.ColorSheetAppBarIcon,
        sideSheetIconColor = dynamicColorCodes.ColorSheetAppBarIcon,
        bottomNavigationBarIconColor = dynamicColorCodes.ColorAppBarIcon,
        buttonIconColor = dynamicColorCodes.ColorFabIcon,
        chipIconColor = dynamicColorCodes.ColorIcon,
        menuIconColor = dynamicColorCodes.ColorIcon,
        searchBarIconColor = dynamicColorCodes.ColorIcon,
        dragHandleColor = dynamicColorCodes.ColorIcon,
        bottomNavigationBarSelectedIconColor = dynamicColorCodes.ColorAccent)
}