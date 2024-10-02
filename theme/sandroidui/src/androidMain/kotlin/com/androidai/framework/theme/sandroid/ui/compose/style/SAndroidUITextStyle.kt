package com.androidai.framework.theme.sandroid.ui.compose.style

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.androidai.framework.theme.sandroid.ui.compose.SAndroidUIFontFamily

object SAndroidUITextStyle {

    val topAppBarTitle = TextStyle(fontSize = SAndroidUIDimens.topAppBarTitleFontSize,
            fontWeight = FontWeight.Medium,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily())

    val topAppBarAction = TextStyle(fontSize = SAndroidUIDimens.topAppBarActionFontSize,
            fontWeight = FontWeight.SemiBold,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily())

    val hint = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily(),
            fontWeight = FontWeight.Medium)

    val noResult = TextStyle(fontSize = SAndroidUIDimens.primaryFontSize,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Normal,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily())

    val query = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily(),
            fontWeight = FontWeight.Medium)

    val radioButtonText = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontWeight = FontWeight.Normal,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily())

    val tab = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontWeight = FontWeight.Medium,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily())

    val errorInfo = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Normal,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily())

    val expandableHeader = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontWeight = FontWeight.SemiBold,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily())

    val retryButtonTitle = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontWeight = FontWeight.Normal,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily(),
            textAlign = TextAlign.Center)

    val positiveButtonTextStyle = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily(),
            fontWeight = FontWeight.SemiBold)

    val negativeButtonTextStyle = TextStyle(fontSize = SAndroidUIDimens.secondaryFontSize,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily(),
            fontWeight = FontWeight.SemiBold)

    val dialogTitle = TextStyle(fontSize = SAndroidUIDimens.primaryFontSize,
            fontFamily = SAndroidUIFontFamily.getComposeFontFamily(),
            fontWeight = FontWeight.SemiBold)

}