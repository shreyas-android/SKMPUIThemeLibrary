package com.androidai.framework.theme.sandroid.ui

import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo
import kotlinx.browser.window

object SWasmThemeCore {

    private const val DARK_COLOR_SCHEME_QUERY = "(prefers-color-scheme: dark)"

    fun init(defaultThemeInfo: DefaultThemeInfo){
        SCommonThemeCore.init(defaultThemeInfo, isNightMode = {
            window.matchMedia(DARK_COLOR_SCHEME_QUERY).matches
        })
    }

    /**
     * Re-reads `(prefers-color-scheme: dark)` and applies it when
     * [com.androidai.framework.theme.sandroid.ui.data.model.enum.Mode.SYSTEM_DEFAULT] is selected.
     *
     * Call this from a `change` listener on `window.matchMedia("(prefers-color-scheme: dark)")`
     * so the theme follows the browser while the page is open.
     */
    fun refreshSystemNightMode() {
        SCommonThemeCore.refreshSystemNightMode()
    }
}
