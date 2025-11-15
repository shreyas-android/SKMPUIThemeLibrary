package com.androidai.framework.theme.sandroid.ui

import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

object SIOSThemeCore {
    fun init(defaultThemeInfo: DefaultThemeInfo) {
        SCommonThemeCore.init(defaultThemeInfo, isNightMode = {
            val style = UIScreen.Companion.mainScreen.traitCollection.userInterfaceStyle
            style == UIUserInterfaceStyle.UIUserInterfaceStyleDark
        })
    }
}