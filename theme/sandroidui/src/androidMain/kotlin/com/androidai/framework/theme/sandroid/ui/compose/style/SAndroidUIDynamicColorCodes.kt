package com.androidai.framework.theme.sandroid.ui.compose.style

import android.content.Context
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColor
import com.google.android.material.elevation.SurfaceColors

class SAndroidUIDynamicColorCodes(val context:Context) {

    val tonalPalette = SAndroidUIDynamicTonalPalette(context)

    val ColorBackground = Color.White
    val ColorBackgroundNight =Color.Black

    val ColorBackgroundSecondary =tonalPalette.secondary90
    val ColorBackgroundSecondaryNight = tonalPalette.secondary30

    val ColorLabelText = tonalPalette.neutral10
    val ColorLabelTextNight = tonalPalette.neutral90

    val ColorLabelDescription = tonalPalette.neutralVariant30
    val ColorLabelDescriptionNight = tonalPalette.neutralVariant80

    val ColorAppBar = tonalPalette.neutral99//  SurfaceColors.SURFACE_1.getColor(context).toComposeColor()
    val ColorAppBarNight = tonalPalette.neutral10 //  SurfaceColors.SURFACE_1.getColor(context).toComposeColor()

    val ColorSheetBackground = tonalPalette.neutral99// SurfaceColors.SURFACE_1.getColor(context).toComposeColor()
    val ColorSheetBackgroundNight = tonalPalette.neutral10 // SurfaceColors.SURFACE_1.getColor(context).toComposeColor()

    val ColorSheetSearchBackground = tonalPalette.neutral99 //SurfaceColors.SURFACE_3.getColor(context).toComposeColor()
    val ColorSheetSearchBackgroundNight = tonalPalette.neutral10 // SurfaceColors.SURFACE_3.getColor(context).toComposeColor()

    val ColorSheetAppBar = tonalPalette.neutral99 // SurfaceColors.SURFACE_3.getColor(context).toComposeColor()
    val ColorSheetAppBarNight = tonalPalette.neutral10 // SurfaceColors.SURFACE_3.getColor(context).toComposeColor()

    val ColorAccent = tonalPalette.primary40
    val ColorAccentNight = tonalPalette.primary80

    val ColorSheetAppBarIcon = tonalPalette.neutral10
    val ColorSheetAppBarIconNight = tonalPalette.neutral90

    val ColorDialogBackground = tonalPalette.neutral99 // SurfaceColors.SURFACE_3.getColor(context).toComposeColor()
    val ColorDialogBackgroundNight = tonalPalette.neutral10 // SurfaceColors.SURFACE_3.getColor(context).toComposeColor()

    val ColorCardBackground = tonalPalette.neutral99 //SurfaceColors.SURFACE_1.getColor(context).toComposeColor()
    val ColorCardBackgroundNight = tonalPalette.neutral10 //SurfaceColors.SURFACE_1.getColor(context).toComposeColor()

    val ColorBottomSheetBackground =  tonalPalette.neutral99//SurfaceColors.SURFACE_1.getColor(context).toComposeColor()
    val ColorBottomSheetBackgroundNight = tonalPalette.neutral10 // SurfaceColors.SURFACE_1.getColor(context).toComposeColor()

    val ColorRipple = ColorAccent.copy(alpha = 0.4f)
    val ColorRippleNight = ColorAccentNight.copy(alpha = 0.4f)

    val ColorShimmer = Color(0xFFDDDDDD)
    val ColorShimmerNight = Color(0xFF1B1B1B)

    val ColorIcon = tonalPalette.primary100
    val ColorIconNight = tonalPalette.primary20

    val ColorAppBarIcon = tonalPalette.neutral10
    val ColorAppBarIconNight = tonalPalette.neutral90

    val ColorAppBarAction = ColorAccent
    val ColorAppBarActionNight = ColorAccentNight

    val ColorAppBarTitle = tonalPalette.neutral10
    val ColorAppBarTitleNight =tonalPalette.neutral90

    val ColorSheetAppBarAction = ColorAppBarAction
    val ColorSheetAppBarActionNight = ColorAppBarActionNight

    val ColorSheetAppBarTitle = ColorAppBarTitle
    val ColorSheetAppBarTitleNight = ColorAppBarTitleNight

    val ColorSheetBottomAppBar = tonalPalette.neutral99 //SurfaceColors.SURFACE_2.getColor(context).toComposeColor()
    val ColorSheetBottomAppBarNight = tonalPalette.neutral10 // SurfaceColors.SURFACE_2.getColor(context).toComposeColor()


    val ColorLine = tonalPalette.neutralVariant50
    val ColorLineNight = tonalPalette.neutralVariant60

    val ColorSecondaryLine = tonalPalette.neutralVariant50
    val ColorSecondaryLineNight = tonalPalette.neutralVariant60

    val ColorHint =tonalPalette.neutralVariant30
    val ColorHintNight = tonalPalette.neutral90

    val ColorTextHighLight = tonalPalette.neutralVariant80
    val ColorTextHighLightNight = tonalPalette.neutral90

    val ColorSwitchDisableTrack = tonalPalette.neutral10
    val ColorSwitchDisableTrackNight = tonalPalette.neutral90

    val ColorSwitchDisableThumb = tonalPalette.neutral99
    val ColorSwitchDisableThumbNight = tonalPalette.neutral10

    val ColorScrim = Color(0x80000000)
    val ColorScrimNight = Color(0xB3000000)

    val ColorFab = tonalPalette.primary90
    val ColorFabNight = tonalPalette.primary30

    val ColorBottomAppBar = tonalPalette.neutral99 // SurfaceColors.SURFACE_2.getColor(context).toComposeColor()
    val ColorBottomAppBarNight = tonalPalette.neutral10 // SurfaceColors.SURFACE_2.getColor(context).toComposeColor()

    val ColorFabIcon = tonalPalette.primary10
    val ColorFabIconNight = tonalPalette.primary90

    val ColorSearchBackground = tonalPalette.neutral99 //SurfaceColors.SURFACE_3.getColor(context).toComposeColor()
    val ColorSearchBackgroundNight = tonalPalette.neutral10 // SurfaceColors.SURFACE_3.getColor(context).toComposeColor()

    val ColorPopupMenuBackground = tonalPalette.neutral99 // SurfaceColors.SURFACE_2.getColor(context).toComposeColor()
    val ColorPopupMenuBackgroundNight = tonalPalette.neutral10 // SurfaceColors.SURFACE_2.getColor(context).toComposeColor()

    val ColorRadioButtonUnSelected = tonalPalette.neutralVariant30
    val ColorRadioButtonUnSelectedNight = tonalPalette.neutralVariant80

    val ColorCheckBoxButtonUnSelected = tonalPalette.neutral10
    val ColorCheckBoxButtonUnSelectedNight = tonalPalette.neutral90

    val ColorError = Color(0xFFB00020)
    val ColorErrorNight = Color(0xFFCF6679)

}

fun Int.toComposeColor() = Color(this)