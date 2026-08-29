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

    /**
     * Notifies the manager that the platform switched between light and dark. Only has a visible
     * effect while [Mode.SYSTEM_DEFAULT] is selected.
     */
    fun onSystemNightModeChanged(isSystemInNightMode : Boolean)

    /**
     * Re-reads the platform light/dark state and applies it if it changed. Useful when the host
     * cannot observe the change itself and only knows that it may have happened (for example on
     * resume).
     */
    fun refreshSystemNightMode()

    fun getModeFlow():StateFlow<Mode>

    fun getActionColorFlow():StateFlow<Color>

    fun getDynamicThemeEnabledFlow():StateFlow<Boolean>

    /**
     * Emits whether the dark palette is currently applied, after resolving [Mode.SYSTEM_DEFAULT]
     * against the platform. Handy for things the theme cannot colour itself, such as status bar
     * icons or a window background.
     */
    fun getIsNightModeFlow():StateFlow<Boolean>

    fun getSAndroidUIColorsFlow() : StateFlow<SAndroidUIColors>
}
