package com.androidai.framework.theme.sandroid.ui.datastore

import com.androidai.framework.theme.sandroid.ui.SCommonThemeCore
import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle

object SIOSThemeCore {
    fun init(defaultThemeInfo: DefaultThemeInfo) {
        SCommonThemeCore.init(defaultThemeInfo, createIOSDataStore(), isNightMode = {
            val style = UIScreen.mainScreen.traitCollection.userInterfaceStyle
            style == UIUserInterfaceStyle.UIUserInterfaceStyleDark
        })
    }
}