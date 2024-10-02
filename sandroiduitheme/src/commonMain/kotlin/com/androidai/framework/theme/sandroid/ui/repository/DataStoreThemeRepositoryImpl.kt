package com.androidai.framework.theme.sandroid.ui.repository


/*

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

}*/
