package com.androidai.framework.theme.sandroid.ui.thememanager

import androidx.compose.ui.graphics.Color
import com.androidai.framework.theme.sandroid.ui.data.model.enum.Mode
import com.androidai.framework.theme.sandroid.ui.data.model.colors.SAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.default.SAndroidUIDefaults
import com.androidai.framework.theme.sandroid.ui.repository.ThemeRepository
import kotlinx.coroutines.flow.StateFlow

interface SAndroidUIThemeManager {

    companion object{
        fun getInstance(themeRepository : ThemeRepository, sAndroidUIDefaults : SAndroidUIDefaults, isNightMode:()->Boolean) : SAndroidUIThemeManager {
            return SAndroidUIThemeManagerImpl(themeRepository, sAndroidUIDefaults, isNightMode)
        }
    }

    fun onModeChanged(selectedMode : Mode)

    fun onDynamicThemeModeChanged(isEnabled : Boolean)

    fun onActionColorChanged(color : Color)

    fun getModeFlow():StateFlow<Mode>

    fun getActionColorFlow():StateFlow<Color>

    fun getDynamicThemeEnabledFlow():StateFlow<Boolean>

    fun getSAndroidUIColorsFlow() : StateFlow<SAndroidUIColors>
}