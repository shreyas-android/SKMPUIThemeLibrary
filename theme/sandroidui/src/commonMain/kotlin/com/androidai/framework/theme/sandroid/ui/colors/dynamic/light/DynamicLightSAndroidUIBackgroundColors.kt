package com.androidai.framework.theme.sandroid.ui.colors.dynamic.light

import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIDynamicColorCodes
import com.androidai.framework.theme.sandroid.ui.data.model.colors.SAndroidUIBackgroundColors

internal fun getDynamicLightSAndroidUIBackgroundColors() : SAndroidUIBackgroundColors {
    val dynamicColorCodes = SAndroidUIDynamicColorCodes()
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