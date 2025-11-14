package com.androidai.framework.theme.sandroid.ui

import android.content.Context
import android.content.res.Configuration
import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo
import com.androidai.framework.theme.sandroid.ui.datastore.createAndroidDataStore

object SAndroidThemeCore {

    fun init(context: Context, defaultThemeInfo : DefaultThemeInfo,){
        SCommonThemeCore.init(defaultThemeInfo, isNightMode = {
            val uiMode = context.resources.configuration.uiMode
            (uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES

        }, dataStore = createAndroidDataStore(context = context))
    }
}