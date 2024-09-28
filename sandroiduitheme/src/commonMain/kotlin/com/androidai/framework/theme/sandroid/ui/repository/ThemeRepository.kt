package com.androidai.framework.theme.sandroid.ui.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.androidai.framework.theme.sandroid.ui.Mode
import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo
import com.androidai.framework.theme.sandroid.ui.getDataStore
import kotlinx.coroutines.flow.Flow

interface ThemeRepository {

    companion object{
        fun getInstance(defaultThemeInfo : DefaultThemeInfo, dataStore : DataStore<Preferences>) : ThemeRepository {
            return ThemeRepositoryImpl(defaultThemeInfo, dataStore)
        }
    }

    fun getThemeMode() : Flow<Int>

    fun getActionColorCode() : Flow<Int>

    fun getDynamicModeEnabled() : Flow<Boolean>

    suspend fun setThemeMode(mode : Int)

    suspend  fun setActionColorCode(code : Int)

    suspend  fun setDynamicModeEnabled(enabled : Boolean)
}