package com.androidai.framework.theme.sandroid.ui.datastore

import com.androidai.framework.theme.sandroid.ui.SCommonThemeCore
import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo

object SJVMThemeCore {

    fun init(defaultThemeInfo: DefaultThemeInfo){
        SCommonThemeCore.init(defaultThemeInfo, createJVMDataStore(), isNightMode = {
            true
        })
    }
}