package com.androidai.framework.theme.sandroid.ui.theme.colors.dynamic.light

import android.content.Context
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIDynamicColorCodes
import com.androidai.framework.theme.sandroid.ui.data.SAndroidUIBackgroundColors

internal fun getDynamicLightSAndroidUIBackgroundColors(context : Context) : SAndroidUIBackgroundColors {
    val dynamicColorCodes = SAndroidUIDynamicColorCodes(context)
   return SAndroidUIBackgroundColors(
        backgroundColor = dynamicColorCodes.ColorBackground,
        topAppBarColor = dynamicColorCodes.ColorAppBar,
        bottomAppBarColor = dynamicColorCodes.ColorBottomAppBar,
        bottomSheetBackgroundColor = dynamicColorCodes.ColorBottomSheetBackground,
        bottomNavigationBarColor = dynamicColorCodes.ColorBottomAppBar,
        sideSheetBackgroundColor = dynamicColorCodes.ColorSheetBackground,
        buttonBackgroundColor = dynamicColorCodes.ColorBackground,
        cardBackgroundColor = dynamicColorCodes.ColorCardBackground,
        dialogBackgroundColor = dynamicColorCodes.ColorDialogBackground,
        searchBarBackgroundColor = dynamicColorCodes.ColorSearchBackground,
        secondaryBackgroundColor = dynamicColorCodes.ColorBackgroundSecondary,
        fabBackgroundColor = dynamicColorCodes.ColorFab,
        menuBackgroundColor = dynamicColorCodes.ColorPopupMenuBackground,
        snackBarBackgroundColor = dynamicColorCodes.ColorCardBackground,
        scrimColor = dynamicColorCodes.ColorScrim,
        selectedTabBackgroundColor = dynamicColorCodes.ColorRipple,
        tabBackgroundColor = dynamicColorCodes.ColorBackground,
        chipBackgroundColor = dynamicColorCodes.ColorBackground,
        chipSelectedBackgroundColor = dynamicColorCodes.ColorRipple)
}