package com.androidai.framework.theme.sandroid.ui

import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo
import kotlinx.browser.window

object SWasmThemeCore {

    fun init(defaultThemeInfo: DefaultThemeInfo){
        SCommonThemeCore.init(defaultThemeInfo, isNightMode = {
            val media = window.matchMedia("(prefers-color-scheme: dark)")
            media.matches
        })
    }
}