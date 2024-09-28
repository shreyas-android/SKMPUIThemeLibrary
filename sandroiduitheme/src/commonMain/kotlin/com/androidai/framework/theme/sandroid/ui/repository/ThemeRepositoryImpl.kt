package com.androidai.framework.theme.sandroid.ui.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import com.androidai.framework.theme.sandroid.ui.Mode
import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

internal class ThemeRepositoryImpl(
        private val defaultThemeInfo : DefaultThemeInfo = DefaultThemeInfo.getDefault(),
        private val dataStore : DataStore<Preferences>) : ThemeRepository {

    private companion object {

        //constants to define the preference key
        const val PREFERENCE_MODE_NAME = "mode_pref"
        const val PREFERENCE_ACTION_COLOR = "action_color_pref"
        const val PREFERENCE_DYNAMIC_COLOR = "dynamic_color_pref"
    }

    override fun getThemeMode() : Flow<Int> {
        return dataStore.data.map { preferences ->
            preferences[intPreferencesKey(PREFERENCE_MODE_NAME)]
                ?: defaultThemeInfo.mode
        }

    }

    override fun getActionColorCode() : Flow<Int> {
        return dataStore.data.map { preferences ->
            preferences[intPreferencesKey(PREFERENCE_ACTION_COLOR)]
                ?: defaultThemeInfo.actionColor
        }
    }

    override fun getDynamicModeEnabled() : Flow<Boolean> {
        return dataStore.data.map { preferences ->
            preferences[booleanPreferencesKey(PREFERENCE_DYNAMIC_COLOR)]
                ?: defaultThemeInfo.isDynamicThemeEnabled
        }
    }

    override suspend fun setThemeMode(mode : Int) {
        dataStore.edit {
            it[intPreferencesKey(PREFERENCE_MODE_NAME)] = mode
        }
    }

    override suspend fun setActionColorCode(code : Int) {
        dataStore.edit {
            it[intPreferencesKey(PREFERENCE_ACTION_COLOR)] = code
        }
    }

    override suspend fun setDynamicModeEnabled(enabled : Boolean) {
        dataStore.edit {
            it[booleanPreferencesKey(PREFERENCE_DYNAMIC_COLOR)] = enabled
        }
    }

}