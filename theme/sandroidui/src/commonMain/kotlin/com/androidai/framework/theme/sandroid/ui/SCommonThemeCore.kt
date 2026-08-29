package com.androidai.framework.theme.sandroid.ui

import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo
import com.androidai.framework.theme.sandroid.ui.default.SAndroidUIDefaults
import com.androidai.framework.theme.sandroid.ui.repository.ThemeRepository
import com.androidai.framework.theme.sandroid.ui.thememanager.SAndroidUIThemeManager
import com.russhwolf.settings.Settings

object SCommonThemeCore {

    private lateinit var themeRepository: ThemeRepository
    private var sAndroidUIDefaults: SAndroidUIDefaults? = null
    private var isNightMode: (() -> Boolean)? = null

    private var defaultThemeManager: SAndroidUIThemeManager? = null
    private val themeManagers = mutableListOf<SAndroidUIThemeManager>()

    fun init(
        defaultThemeInfo: DefaultThemeInfo,
        isNightMode: () -> Boolean
    ) {
        SCommonThemeCore.isNightMode = {
            isNightMode.invoke()
        }
        sAndroidUIDefaults = SAndroidUIDefaults()

        themeRepository = ThemeRepository.getInstance(defaultThemeInfo,
            Settings()
        )
    }

    fun updateIsNightMode(isNightMode: (() -> Boolean)) {
        this.isNightMode = isNightMode
        refreshSystemNightMode()
    }

    /**
     * Pushes a light/dark change of the platform to every theme manager handed out so far, so
     * that apps running in [com.androidai.framework.theme.sandroid.ui.data.model.enum.Mode.SYSTEM_DEFAULT]
     * follow the system while they are running instead of only on the next launch.
     */
    fun onSystemNightModeChanged(isSystemInNightMode: Boolean) {
        themeManagers.forEach { it.onSystemNightModeChanged(isSystemInNightMode) }
    }

    /**
     * Re-reads the platform light/dark state and applies it to every theme manager handed out
     * so far.
     */
    fun refreshSystemNightMode() {
        val isSystemInNightMode = isNightMode?.invoke() ?: return
        onSystemNightModeChanged(isSystemInNightMode)
    }

    /**
     * Stops delivering system light/dark changes to [themeManager].
     */
    fun releaseThemeManager(themeManager: SAndroidUIThemeManager) {
        themeManagers.remove(themeManager)
        if(defaultThemeManager === themeManager) {
            defaultThemeManager = null
        }
    }

    fun getThemeManager(): SAndroidUIThemeManager {
        // The manager owns the persisted theme state, so a single shared instance is handed out
        // instead of creating a new one on every call (activity recreation, recomposition, ...).
        return defaultThemeManager ?: register(
            SAndroidUIThemeManager.getInstance(
                themeRepository, sAndroidUIDefaults!!, isNightMode!!
            )
        ).also { defaultThemeManager = it }
    }

    fun getThemeManager(sAndroidUIDefaults: SAndroidUIDefaults): SAndroidUIThemeManager {
        this.sAndroidUIDefaults = sAndroidUIDefaults
        return register(
            SAndroidUIThemeManager.getInstance(
                themeRepository, sAndroidUIDefaults, isNightMode!!
            )
        )
    }

    fun getThemeManager(
        themeRepository: ThemeRepository, sAndroidUIDefaults: SAndroidUIDefaults,
        isNightMode: () -> Boolean
    ): SAndroidUIThemeManager {
        this.themeRepository = themeRepository
        this.sAndroidUIDefaults = sAndroidUIDefaults
        this.isNightMode = isNightMode
        return register(
            SAndroidUIThemeManager.getInstance(themeRepository, sAndroidUIDefaults, isNightMode)
        )
    }

    private fun register(themeManager: SAndroidUIThemeManager): SAndroidUIThemeManager {
        themeManagers.add(themeManager)
        return themeManager
    }
}
