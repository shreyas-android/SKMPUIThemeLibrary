package com.androidai.framework.theme.sandroid.ui.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.androidai.framework.theme.sandroid.Res
import com.androidai.framework.theme.sandroid.roboto
import com.androidai.framework.theme.sandroid.roboto_bold
import com.androidai.framework.theme.sandroid.roboto_medium
import org.jetbrains.compose.resources.Font


// TODO:SHOULD HANDLE THE FONT
object SAndroidUIFontFamily {

    @Composable
    fun robotoFontFamily() = FontFamily(
        Font(Res.font.roboto, FontWeight.Normal),
        Font(Res.font.roboto_medium, FontWeight.Medium),
        Font(Res.font.roboto_bold, FontWeight.Bold)
    )



    @Composable
    fun getComposeFontFamily(): FontFamily {
        return robotoFontFamily() //FontFamily(Typeface)
    }

    @Composable
    fun getCalendarFontFamilyInfo() = SAndroidUIFontFamilyInfo(
        getComposeFontFamily(),
            getComposeFontFamily(), getComposeFontFamily(), getComposeFontFamily())
}