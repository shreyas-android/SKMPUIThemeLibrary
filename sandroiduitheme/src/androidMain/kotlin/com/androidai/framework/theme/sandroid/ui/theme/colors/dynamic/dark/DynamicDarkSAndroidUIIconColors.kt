package com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.dark

import android.content.Context
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIColorCodes
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIDynamicColorCodes
import com.androidai.framework.theme.sandroid.ui.data.SAndroidUIIconColors

internal fun getDynamicDarkSAndroidUIIconColors(context : Context) : SAndroidUIIconColors {
    val dynamicColorCodes = SAndroidUIDynamicColorCodes(context)
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