package com.androidai.framework.theme.sandroid.ui

import android.content.ComponentCallbacks
import android.content.Context
import android.content.res.Configuration
import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo

object SAndroidThemeCore {

    private var isSystemNightModeObserved = false

    fun init(context: Context, defaultThemeInfo : DefaultThemeInfo,){
        val appContext = context.applicationContext ?: context
        SCommonThemeCore.init(defaultThemeInfo, isNightMode = {
            appContext.resources.configuration.isInNightMode()
        })
        observeSystemNightMode(appContext)
    }

    /**
     * Re-reads the system light/dark setting and applies it when
     * [com.androidai.framework.theme.sandroid.ui.data.model.enum.Mode.SYSTEM_DEFAULT] is selected.
     */
    fun refreshSystemNightMode() {
        SCommonThemeCore.refreshSystemNightMode()
    }

    /**
     * Keeps the theme in sync with the system light/dark setting while the app is running. Without
     * this the palette would only be resolved once and a change made in the system settings would
     * be picked up on the next launch.
     */
    private fun observeSystemNightMode(appContext : Context) {
        if(isSystemNightModeObserved) {
            return
        }
        isSystemNightModeObserved = true
        appContext.registerComponentCallbacks(object : ComponentCallbacks {

            override fun onConfigurationChanged(newConfig : Configuration) {
                SCommonThemeCore.onSystemNightModeChanged(newConfig.isInNightMode())
            }

            override fun onLowMemory() {
                // No-op, only configuration changes are of interest here.
            }
        })
    }

    private fun Configuration.isInNightMode() : Boolean {
        return (uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
    }
}
