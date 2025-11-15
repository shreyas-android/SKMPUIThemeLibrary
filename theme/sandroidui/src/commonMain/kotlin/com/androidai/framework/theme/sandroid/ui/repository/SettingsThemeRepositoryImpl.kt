package com.androidai.framework.theme.sandroid.ui.repository

import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo
import com.androidai.framework.theme.sandroid.ui.datastore.PrefKeyUtils.PREFERENCE_ACTION_COLOR
import com.androidai.framework.theme.sandroid.ui.datastore.PrefKeyUtils.PREFERENCE_DYNAMIC_COLOR
import com.androidai.framework.theme.sandroid.ui.datastore.PrefKeyUtils.PREFERENCE_MODE_NAME
import com.russhwolf.settings.Settings
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

internal class SettingsThemeRepositoryImpl(
    private val defaultThemeInfo: DefaultThemeInfo,
    private val settings: Settings
) : ThemeRepository {

    override fun getThemeMode() : Flow<Int> {
        return MutableStateFlow(settings.getInt(PREFERENCE_MODE_NAME,
            defaultThemeInfo.mode))

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