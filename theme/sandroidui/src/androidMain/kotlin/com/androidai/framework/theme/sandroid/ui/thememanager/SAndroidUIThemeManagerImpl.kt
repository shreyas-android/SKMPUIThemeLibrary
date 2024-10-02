package com.androidai.framework.theme.sandroid.ui.thememanager

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.androidai.framework.theme.sandroid.ui.Mode
import com.androidai.framework.theme.sandroid.ui.data.SAndroidUIColors
import com.androidai.framework.theme.sandroid.ui.default.SAndroidUIDefaults
import com.androidai.framework.theme.sandroid.ui.ext.toMode
import com.androidai.framework.theme.sandroid.ui.repository.ThemeRepository
import com.androidai.framework.theme.sandroid.ui.theme.colors.DefaultLightSAndroidUIColors
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class SAndroidUIThemeManagerImpl(
        private val themeRepository : ThemeRepository,
        private val sAndroidUIDefaults : SAndroidUIDefaults, private val isNightMode : () -> Boolean) : SAndroidUIThemeManager {

    private val scope = CoroutineScope(Dispatchers.IO)

    private val sAndroidUIColors = MutableStateFlow(DefaultLightSAndroidUIColors)

    private val actionColorFlow = MutableStateFlow(Color.Black)
    private val modeFlow = MutableStateFlow(Mode.SYSTEM_DEFAULT)
    private val isDynamicThemeEnabledFlow = MutableStateFlow(false)

    init {
        collectAllPrefValue()
    }

    private fun collectAllPrefValue() {
        scope.launch {
            themeRepository.getThemeMode().collectLatest {
                onApplyModeTheme(it.toMode())
            }
        }

        scope.launch {
            themeRepository.getActionColorCode().collectLatest {
                onApplyActionColorTheme(Color(it))
            }
        }

        scope.launch {
            themeRepository.getDynamicModeEnabled().collectLatest {
                onApplyDynamicThemeMode(it)
            }
        }
    }

    override fun onModeChanged(selectedMode : Mode) {
        scope.launch {
            onApplyModeTheme(selectedMode)
            themeRepository.setThemeMode(selectedMode.value)

        }
    }

    private fun onApplyModeTheme(selectedMode : Mode) {
        modeFlow.value = selectedMode
        updateTheme(
            actionColorFlow.value, getIsNightMode(), isDynamicThemeEnabledFlow.value)
    }

    private fun onApplyDynamicThemeMode(isEnabled : Boolean) {
        isDynamicThemeEnabledFlow.value = isEnabled
        updateTheme(actionColorFlow.value, getIsNightMode(), isEnabled)
    }

    override fun onDynamicThemeModeChanged(isEnabled : Boolean) {
        scope.launch {
            onApplyDynamicThemeMode(isEnabled)
            themeRepository.setDynamicModeEnabled(isEnabled)

        }
    }

    private fun onApplyActionColorTheme(color : Color) {
        actionColorFlow.value = color
        updateTheme(color, getIsNightMode(), isDynamicThemeEnabledFlow.value)
    }

    override fun onActionColorChanged(color : Color) {
        scope.launch {
            onApplyActionColorTheme(color)
            themeRepository.setActionColorCode(color.toArgb())

        }
    }

    override fun getModeFlow() : StateFlow<Mode> {
        return modeFlow
    }

    override fun getActionColorFlow() : StateFlow<Color> {
        return actionColorFlow
    }

    override fun getDynamicThemeEnabledFlow() : StateFlow<Boolean> {
        return isDynamicThemeEnabledFlow
    }

    private fun updateTheme(
            actionColor : Color, isNightMode : Boolean, isDynamicThemeEnabled : Boolean) {
        sAndroidUIColors.update {
            sAndroidUIDefaults.getSAndroidUIColors(isNightMode, isDynamicThemeEnabled, actionColor)
        }
    }

    private fun getIsNightMode() =
        when(modeFlow.value) {
            Mode.DARK -> {
                true
            }
            Mode.SYSTEM_DEFAULT -> {
                isNightMode.invoke()
            }
            else -> {
                false
            }
        }

    override fun getSAndroidUIColorsFlow() : StateFlow<SAndroidUIColors> {
        return sAndroidUIColors
    }
}