package com.androidai.framework.theme.sandroid.ui.repository

import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo
import com.russhwolf.settings.Settings
import com.russhwolf.settings.get
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

internal class SettingsThemeRepositoryImpl(
        private val defaultThemeInfo : DefaultThemeInfo = DefaultThemeInfo.getDefault(),
        private val settings : Settings) : ThemeRepository {

    private companion object {

        //constants to define the preference key
        const val PREFERENCE_MODE_NAME = "mode_pref"
        const val PREFERENCE_ACTION_COLOR = "action_color_pref"
        const val PREFERENCE_DYNAMIC_COLOR = "dynamic_color_pref"
    }

    override fun getThemeMode() : Flow<Int> {
        return MutableStateFlow(settings.getInt(PREFERENCE_MODE_NAME, defaultThemeInfo.mode))

    }

    override fun getActionColorCode() : Flow<Int> {
        return MutableStateFlow(
            settings.getInt(PREFERENCE_ACTION_COLOR, defaultThemeInfo.actionColor))
    }

    override fun getDynamicModeEnabled() : Flow<Boolean> {
        return MutableStateFlow(
            settings.getBoolean(PREFERENCE_DYNAMIC_COLOR, defaultThemeInfo.isDynamicThemeEnabled))
    }

    override suspend fun setThemeMode(mode : Int) {
        settings.putInt(PREFERENCE_MODE_NAME, mode)
    }

    override suspend fun setActionColorCode(code : Int) {
        settings.putInt(PREFERENCE_ACTION_COLOR, code)
    }

    override suspend fun setDynamicModeEnabled(enabled : Boolean) {
        settings.putBoolean(PREFERENCE_DYNAMIC_COLOR, enabled)
    }

}