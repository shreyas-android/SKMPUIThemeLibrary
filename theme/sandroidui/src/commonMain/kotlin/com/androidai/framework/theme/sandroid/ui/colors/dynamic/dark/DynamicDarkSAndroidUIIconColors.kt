package com.androidai.framework.theme.sandroid.ui.colors.dynamic.dark

import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIDynamicColorCodes
import com.androidai.framework.theme.sandroid.ui.data.model.colors.SAndroidUIIconColors

internal fun getDynamicDarkSAndroidUIIconColors() : SAndroidUIIconColors {
    val dynamicColorCodes = SAndroidUIDynamicColorCodes()
    return  SAndroidUIIconColors(
        iconColor = dynamicColorCodes.ColorIconNight,
        tabIconColor = dynamicColorCodes.ColorIconNight,
        topAppBarIconColor = dynamicColorCodes.ColorAppBarIconNight,
        bottomAppBarIconColor = dynamicColorCodes.ColorAppBarIconNight,
        fabIconColor = dynamicColorCodes.ColorFabIconNight,
        bottomSheetIconColor = dynamicColorCodes.ColorSheetAppBarIconNight,
        sideSheetIconColor = dynamicColorCodes.ColorSheetAppBarIconNight,
        bottomNavigationBarIconColor = dynamicColorCodes.ColorAppBarIconNight,
        buttonIconColor = dynamicColorCodes.ColorFabIconNight,
        chipIconColor = dynamicColorCodes.ColorIconNight,
        menuIconColor = dynamicColorCodes.ColorIconNight,
        searchBarIconColor = dynamicColorCodes.ColorIconNight,
        dragHandleColor = dynamicColorCodes.ColorIconNight,
        bottomNavigationBarSelectedIconColor = dynamicColorCodes.ColorAccentNight)
}