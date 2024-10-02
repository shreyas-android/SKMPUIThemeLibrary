package com.androidai.framework.theme.sandroid.ui.compose.style

import android.content.Context
import androidx.annotation.ColorRes
import androidx.annotation.DoNotInline
import androidx.annotation.RequiresApi
import androidx.compose.ui.graphics.Color

class SAndroidUIDynamicTonalPalette(context : Context) {

    // The neutral tonal range from the generated dynamic color palette.
    val neutral100 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_0)
    val neutral99 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_10)
    val neutral95 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_50)
    val neutral90 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_100)
    val neutral80 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_200)
    val neutral70 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_300)
    val neutral60 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_400)
    val neutral50 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_500)
    val neutral40 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_600)
    val neutral30 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_700)
    val neutral20 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_800)
    val neutral10 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_900)
    val neutral0 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_1000)

    // The neutral variant tonal range, sometimes called "neutral 2",  from the
    // generated dynamic color palette.
    val neutralVariant100 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_0)
    val neutralVariant99 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_10)
    val neutralVariant95 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_50)
    val neutralVariant90 =
        ColorResourceHelper.getColor(context, android.R.color.system_neutral2_100)
    val neutralVariant80 =
        ColorResourceHelper.getColor(context, android.R.color.system_neutral2_200)
    val neutralVariant70 =
        ColorResourceHelper.getColor(context, android.R.color.system_neutral2_300)
    val neutralVariant60 =
        ColorResourceHelper.getColor(context, android.R.color.system_neutral2_400)
    val neutralVariant50 =
        ColorResourceHelper.getColor(context, android.R.color.system_neutral2_500)
    val neutralVariant40 =
        ColorResourceHelper.getColor(context, android.R.color.system_neutral2_600)
    val neutralVariant30 =
        ColorResourceHelper.getColor(context, android.R.color.system_neutral2_700)
    val neutralVariant20 =
        ColorResourceHelper.getColor(context, android.R.color.system_neutral2_800)
    val neutralVariant10 =
        ColorResourceHelper.getColor(context, android.R.color.system_neutral2_900)
    val neutralVariant0 =
        ColorResourceHelper.getColor(context, android.R.color.system_neutral2_1000)

    // The primary tonal range from the generated dynamic color palette.
    val primary100 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_0)
    val primary99 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_10)
    val primary95 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_50)
    val primary90 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_100)
    val primary80 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_200)
    val primary70 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_300)
    val primary60 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_400)
    val primary50 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_500)
    val primary40 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_600)
    val primary30 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_700)
    val primary20 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_800)
    val primary10 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_900)
    val primary0 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_1000)

    // The secondary tonal range from the generated dynamic color palette.
    val secondary100 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_0)
    val secondary99 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_10)
    val secondary95 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_50)
    val secondary90 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_100)
    val secondary80 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_200)
    val secondary70 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_300)
    val secondary60 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_400)
    val secondary50 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_500)
    val secondary40 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_600)
    val secondary30 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_700)
    val secondary20 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_800)
    val secondary10 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_900)
    val secondary0 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_1000)

    // The tertiary tonal range from the generated dynamic color palette.
    val tertiary100 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_0)
    val tertiary99 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_10)
    val tertiary95 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_50)
    val tertiary90 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_100)
    val tertiary80 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_200)
    val tertiary70 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_300)
    val tertiary60 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_400)
    val tertiary50 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_500)
    val tertiary40 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_600)
    val tertiary30 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_700)
    val tertiary20 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_800)
    val tertiary10 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_900)
    val tertiary0 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_1000)
}

@RequiresApi(23)
private object ColorResourceHelper {

    @DoNotInline
    fun getColor(
            context : Context,
            @ColorRes
            id : Int) : Color {
        return Color(context.resources.getColor(id, context.theme))
    }
}