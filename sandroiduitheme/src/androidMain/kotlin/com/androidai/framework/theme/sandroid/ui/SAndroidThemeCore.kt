package com.androidai.framework.theme.sandroid.ui

import android.content.Context
import android.content.res.Configuration
import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo
import com.androidai.framework.theme.sandroid.ui.default.SAndroidUIDefaults
import com.androidai.framework.theme.sandroid.ui.repository.ThemeRepository
import com.androidai.framework.theme.sandroid.ui.thememanager.SAndroidUIThemeManager

object SAndroidThemeCore {

    private lateinit var themeRepository : ThemeRepository
    private var sAndroidUIDefaults:SAndroidUIDefaults? = null
    private var isNightMode : (() -> Boolean)? = null

    fun init(
            context : Context,
            defaultThemeInfo : DefaultThemeInfo = DefaultThemeInfo.getDefault()) {
        val datastore = getDataStore(context)
        isNightMode = {
            context.resources.configuration.uiMode.and(
                    Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
        }
        sAndroidUIDefaults = SAndroidUIDefaults(context)
        themeRepository = ThemeRepository.getInstance(defaultThemeInfo, datastore)
    }

    fun updateIsNightMode(isNightMode : (() -> Boolean)) {
        this.isNightMode = isNightMode
    }

    fun getThemeManager() : SAndroidUIThemeManager {
        return SAndroidUIThemeManager.getInstance(
            themeRepository, sAndroidUIDefaults!!, isNightMode!!)
    }

    fun getThemeManager(sAndroidUIDefaults : SAndroidUIDefaults) : SAndroidUIThemeManager {
        this.sAndroidUIDefaults = sAndroidUIDefaults
        return SAndroidUIThemeManager.getInstance(
            themeRepository, sAndroidUIDefaults, isNightMode!!)
    }

    fun getThemeManager(
            themeRepository : ThemeRepository, sAndroidUIDefaults : SAndroidUIDefaults,
            isNightMode : () -> Boolean) : SAndroidUIThemeManager {
        this.themeRepository = themeRepository
        this.sAndroidUIDefaults = sAndroidUIDefaults
        this.isNightMode = isNightMode
        return SAndroidUIThemeManager.getInstance(themeRepository, sAndroidUIDefaults, isNightMode)
    }
}