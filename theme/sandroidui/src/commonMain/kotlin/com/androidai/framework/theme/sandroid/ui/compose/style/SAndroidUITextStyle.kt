package com.androidai.framework.theme.sandroid.ui.compose.style

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.androidai.framework.theme.sandroid.ui.compose.SAndroidUIFontFamily

object SAndroidUITextStyle {

    @Composable
    fun topAppBarTitle() = TextStyle(fontSize = SAndroidUIDimens.topAppBarTitleFontSize,
            fontWeight = FontWeight.Medium,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily())

    @Composable
    fun topAppBarAction() = TextStyle(fontSize = SAndroidUIDimens.topAppBarActionFontSize,
            fontWeight = FontWeight.SemiBold,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily())

    @Composable
    fun hint() = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily(),
            fontWeight = FontWeight.Medium)

    @Composable
    fun noResult() = TextStyle(fontSize = SAndroidUIDimens.primaryFontSize,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Normal,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily())

    @Composable
    fun query() = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily(),
            fontWeight = FontWeight.Medium)

    @Composable
    fun radioButtonText() = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontWeight = FontWeight.Normal,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily())

    @Composable
    fun tab() = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontWeight = FontWeight.Medium,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily())

    @Composable
    fun errorInfo() = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Normal,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily())

    @Composable
    fun expandableHeader() = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontWeight = FontWeight.SemiBold,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily())

    @Composable
    fun retryButtonTitle() = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontWeight = FontWeight.Normal,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily(),
            textAlign = TextAlign.Center)

    @Composable
    fun positiveButtonTextStyle() = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily(),
            fontWeight = FontWeight.SemiBold)

    @Composable
    fun negativeButtonTextStyle() = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily(),
            fontWeight = FontWeight.SemiBold)

    @Composable
    fun dialogTitle() = TextStyle(fontSize = SAndroidUIDimens.primaryFontSize,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily(),
            fontWeight = FontWeight.SemiBold)

}