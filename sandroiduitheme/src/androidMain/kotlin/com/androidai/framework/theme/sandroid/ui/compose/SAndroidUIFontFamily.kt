package com.androidai.framework.theme.sandroid.ui.compose

import android.graphics.Typeface
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import com.androidai.framework.theme.sandroid.ui.R

// TODO:SHOULD HANDLE THE FONT
object SAndroidUIFontFamily {

    val provider = GoogleFont.Provider(
        providerAuthority = "com.google.android.gms.fonts",
        providerPackage = "com.google.android.gms",
        certificates = R.array.com_google_android_gms_fonts_certs
    )
    private val fontName = GoogleFont("Roboto")

    private val robotoFontFamily = FontFamily(
        Font(googleFont = fontName, provider)
    )

    fun getComposeFontFamily(): FontFamily {
        return robotoFontFamily
    }

    fun getFontFamily(): Typeface {
        return Typeface.DEFAULT
    }

    fun getCalendarFontFamilyInfo() = SAndroidUIFontFamilyInfo(
        getComposeFontFamily(),
            getComposeFontFamily(), getComposeFontFamily(), getComposeFontFamily())
}