package com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.dark

import android.content.Context
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIColorCodes
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIDynamicColorCodes
import com.androidai.framework.theme.sandroid.ui.data.SAndroidUIBackgroundColors



internal fun getDynamicDarkSAndroidUIBackgroundColors(context : Context) : SAndroidUIBackgroundColors {
    val dynamicColorCodes = SAndroidUIDynamicColorCodes(context)
   return SAndroidUIBackgroundColors(
        backgroundColor = dynamicColorCodes.ColorBackgroundNight,
        topAppBarColor = dynamicColorCodes.ColorAppBarNight,
        bottomAppBarColor = dynamicColorCodes.ColorBottomAppBarNight,
        bottomSheetBackgroundColor = dynamicColorCodes.ColorBottomSheetBackgroundNight,
        bottomNavigationBarColor = dynamicColorCodes.ColorBottomAppBarNight,
        sideSheetBackgroundColor = dynamicColorCodes.ColorSheetBackgroundNight,
        buttonBackgroundColor = dynamicColorCodes.ColorBackgroundNight,
        cardBackgroundColor = dynamicColorCodes.ColorCardBackgroundNight,
        dialogBackgroundColor = dynamicColorCodes.ColorDialogBackgroundNight,
        searchBarBackgroundColor = dynamicColorCodes.ColorSearchBackgroundNight,
        secondaryBackgroundColor = dynamicColorCodes.ColorBackgroundSecondaryNight,
        fabBackgroundColor = dynamicColorCodes.ColorFabNight,
        menuBackgroundColor = dynamicColorCodes.ColorPopupMenuBackgroundNight,
        snackBarBackgroundColor = dynamicColorCodes.ColorCardBackgroundNight,
        scrimColor = dynamicColorCodes.ColorScrimNight,
        selectedTabBackgroundColor = dynamicColorCodes.ColorRippleNight,
        tabBackgroundColor = dynamicColorCodes.ColorBackgroundNight,
        chipBackgroundColor = dynamicColorCodes.ColorBackgroundNight,
        chipSelectedBackgroundColor = dynamicColorCodes.ColorAccentNight)
}