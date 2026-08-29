package com.androidai.framework.theme.sandroid.ui

import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo

object SJVMThemeCore {

    /**
     * Name of the system property used to tell the library which appearance the desktop is using,
     * for example `-Dsandroidui.nightMode=true`.
     */
    const val NIGHT_MODE_PROPERTY = "sandroidui.nightMode"

    /**
     * @param isNightMode resolves the desktop light/dark setting. The JVM has no portable API for
     * it, so the default reads [NIGHT_MODE_PROPERTY] and falls back to the light theme. Pass a
     * platform specific detection here when the host application has one.
     */
    fun init(defaultThemeInfo: DefaultThemeInfo, isNightMode: () -> Boolean = { readNightModeProperty() }) {
        SCommonThemeCore.init(defaultThemeInfo, isNightMode = isNightMode)
    }

    /**
     * Re-reads the desktop light/dark setting and applies it when
     * [com.androidai.framework.theme.sandroid.ui.data.model.enum.Mode.SYSTEM_DEFAULT] is selected.
     */
    fun refreshSystemNightMode() {
        SCommonThemeCore.refreshSystemNightMode()
    }

    private fun readNightModeProperty(): Boolean {
        return System.getProperty(NIGHT_MODE_PROPERTY)?.toBooleanStrictOrNull() ?: false
    }
}
