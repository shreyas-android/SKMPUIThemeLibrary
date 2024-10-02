package com.androidai.framework.theme.sandroid.ui.repository

import com.androidai.framework.theme.sandroid.ui.Mode
import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo
import com.russhwolf.settings.Settings
import kotlinx.coroutines.flow.Flow

interface ThemeRepository {

    companion object{
       /* fun getInstance(defaultThemeInfo : DefaultThemeInfo, dataStore : DataStore<Preferences>) : ThemeRepository {
            return ThemeRepositoryImpl(defaultThemeInfo, dataStore)
        }*/

        fun getInstance(defaultThemeInfo : DefaultThemeInfo, settings : Settings) : ThemeRepository {
            return SettingsThemeRepositoryImpl(defaultThemeInfo, settings)
        }
    }

    fun getThemeMode() : Flow<Int>

    fun getActionColorCode() : Flow<Int>

    fun getDynamicModeEnabled() : Flow<Boolean>

    suspend fun setThemeMode(mode : Int)

    suspend  fun setActionColorCode(code : Int)

    suspend  fun setDynamicModeEnabled(enabled : Boolean)
}