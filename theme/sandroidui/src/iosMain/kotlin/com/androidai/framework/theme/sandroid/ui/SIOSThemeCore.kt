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

    /**
     * Re-reads the system light/dark setting and applies it when
     * [com.androidai.framework.theme.sandroid.ui.data.model.enum.Mode.SYSTEM_DEFAULT] is selected.
     *
     * UIKit only reports appearance changes through the responder chain, so call this from
     * `traitCollectionDidChange` (or `UIApplicationDidBecomeActiveNotification`) to keep the
     * theme in sync while the app is running.
     */
    fun refreshSystemNightMode() {
        SCommonThemeCore.refreshSystemNightMode()
    }
}
