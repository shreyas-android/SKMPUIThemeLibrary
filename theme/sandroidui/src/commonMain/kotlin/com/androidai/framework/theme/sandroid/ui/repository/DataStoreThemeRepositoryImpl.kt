package com.androidai.framework.theme.sandroid.ui.repository

/*

internal class DataStoreThemeRepositoryImpl(
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

}*/
