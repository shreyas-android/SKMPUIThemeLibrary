package com.androidai.framework.theme.sandroid.ui.compose

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.androidai.framework.theme.sandroid.Res
import com.androidai.framework.theme.sandroid.roboto
import com.androidai.framework.theme.sandroid.roboto_black
import com.androidai.framework.theme.sandroid.roboto_bold
import com.androidai.framework.theme.sandroid.roboto_extraBold
import com.androidai.framework.theme.sandroid.roboto_extraLight
import com.androidai.framework.theme.sandroid.roboto_light
import com.androidai.framework.theme.sandroid.roboto_medium
import com.androidai.framework.theme.sandroid.roboto_regular
import com.androidai.framework.theme.sandroid.roboto_semiBold
import com.androidai.framework.theme.sandroid.roboto_thin
import com.androidai.framework.theme.sandroid.ui.compose.SAndroidUIFontFamily.getComposeFontFamily
import org.jetbrains.compose.resources.Font


// TODO:SHOULD HANDLE THE FONT
object SAndroidUIFontFamily {

    @Composable
    fun robotoFontFamily() = FontFamily(
        Font(Res.font.roboto_thin, weight = FontWeight.Thin, style = FontStyle.Normal),
        Font(
            Res.font.roboto_extraLight,
            weight = FontWeight.ExtraLight,
            style = FontStyle.Normal
        ),


        Font(Res.font.roboto_light, weight = FontWeight.Light, style = FontStyle.Normal),

        Font(Res.font.roboto_regular, weight = FontWeight.Normal, style = FontStyle.Normal),

        Font(Res.font.roboto_medium, weight = FontWeight.Medium, style = FontStyle.Normal),

        Font(Res.font.roboto_semiBold, weight = FontWeight.SemiBold, style = FontStyle.Normal),


        Font(Res.font.roboto_bold, weight = FontWeight.Bold, style = FontStyle.Normal),
        Font(
            Res.font.roboto_extraBold,
            weight = FontWeight.ExtraBold,
            style = FontStyle.Normal
        ),


        Font(Res.font.roboto_black, weight = FontWeight.Black, style = FontStyle.Normal),
    )



    @Composable
    fun getComposeFontFamily(): FontFamily {
        return robotoFontFamily()
    }

}

@Composable
fun RobotoTypography(): androidx.compose.material3.Typography {
    val defaultTypography = Typography()
    val robotoFamily = getComposeFontFamily()

    return defaultTypography.copy(
        // DISPLAY
        displayLarge = defaultTypography.displayLarge.copy(fontFamily = robotoFamily),
        displayMedium = defaultTypography.displayMedium.copy(fontFamily = robotoFamily),
        displaySmall = defaultTypography.displaySmall.copy(fontFamily = robotoFamily),

        // HEADLINE
        headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = robotoFamily),
        headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = robotoFamily),
        headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = robotoFamily),

        // TITLE
        titleLarge = defaultTypography.titleLarge.copy(fontFamily = robotoFamily),
        titleMedium = defaultTypography.titleMedium.copy(fontFamily = robotoFamily),
        titleSmall = defaultTypography.titleSmall.copy(fontFamily = robotoFamily),

        // BODY
        bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = robotoFamily),
        bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = robotoFamily),
        bodySmall = defaultTypography.bodySmall.copy(fontFamily = robotoFamily),

        // LABEL
        labelLarge = defaultTypography.labelLarge.copy(fontFamily = robotoFamily),
        labelMedium = defaultTypography.labelMedium.copy(fontFamily = robotoFamily),
        labelSmall = defaultTypography.labelSmall.copy(fontFamily = robotoFamily),
    )
}