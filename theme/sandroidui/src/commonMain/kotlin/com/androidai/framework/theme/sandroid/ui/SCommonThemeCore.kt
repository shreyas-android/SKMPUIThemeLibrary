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
    }

    fun getThemeManager(): SAndroidUIThemeManager {
        return SAndroidUIThemeManager.getInstance(
            themeRepository, sAndroidUIDefaults!!, isNightMode!!
        )
    }

    fun getThemeManager(sAndroidUIDefaults: SAndroidUIDefaults): SAndroidUIThemeManager {
        this.sAndroidUIDefaults = sAndroidUIDefaults
        return SAndroidUIThemeManager.getInstance(
            themeRepository, sAndroidUIDefaults, isNightMode!!
        )
    }

    fun getThemeManager(
        themeRepository: ThemeRepository, sAndroidUIDefaults: SAndroidUIDefaults,
        isNightMode: () -> Boolean
    ): SAndroidUIThemeManager {
        this.themeRepository = themeRepository
        this.sAndroidUIDefaults = sAndroidUIDefaults
        this.isNightMode = isNightMode
        return SAndroidUIThemeManager.getInstance(themeRepository, sAndroidUIDefaults, isNightMode)
    }
}