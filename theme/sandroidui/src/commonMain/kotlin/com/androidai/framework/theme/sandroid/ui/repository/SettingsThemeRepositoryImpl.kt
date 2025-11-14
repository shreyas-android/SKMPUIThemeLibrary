package com.androidai.framework.theme.sandroid.ui.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo
import com.androidai.framework.theme.sandroid.ui.datastore.PrefKeyUtils.preferencesActionColorKey
import com.androidai.framework.theme.sandroid.ui.datastore.PrefKeyUtils.preferencesDynamicColorKey
import com.androidai.framework.theme.sandroid.ui.datastore.PrefKeyUtils.preferencesModeKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map

internal class SettingsThemeRepositoryImpl(
    private val defaultThemeInfo: DefaultThemeInfo,
    private val settings: DataStore<Preferences>
) : ThemeRepository {

    override fun getThemeMode() : Flow<Int> {
        return settings.data.map {  preferences ->
            preferences[preferencesModeKey] ?: defaultThemeInfo.mode
        }
    }

    override fun getActionColorCode() : Flow<Int> {
        return settings.data.map { preferences ->
            preferences[preferencesActionColorKey] ?: defaultThemeInfo.actionColor
        }
    }

    override fun getDynamicModeEnabled() : Flow<Boolean> {
        return settings.data.map { preferences ->
            preferences[preferencesDynamicColorKey] ?: defaultThemeInfo.isDynamicThemeEnabled
        }
    }

    override suspend fun setThemeMode(mode : Int) {
        settings.edit { preferences ->
            preferences[preferencesModeKey] = mode
        }
    }

    override suspend fun setActionColorCode(code : Int) {
        settings.edit { preferences ->
            preferences[preferencesActionColorKey] = code
        }
    }

    override suspend fun setDynamicModeEnabled(enabled : Boolean) {
        settings.edit { preferences ->
            preferences[preferencesDynamicColorKey] = enabled
        }
    }

}