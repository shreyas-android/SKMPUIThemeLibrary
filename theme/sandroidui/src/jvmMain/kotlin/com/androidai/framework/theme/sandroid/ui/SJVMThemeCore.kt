package com.androidai.framework.theme.sandroid.ui

import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo

object SJVMThemeCore {

    fun init(defaultThemeInfo: DefaultThemeInfo){
        SCommonThemeCore.init(defaultThemeInfo, isNightMode = {
            true
        })
    }
}