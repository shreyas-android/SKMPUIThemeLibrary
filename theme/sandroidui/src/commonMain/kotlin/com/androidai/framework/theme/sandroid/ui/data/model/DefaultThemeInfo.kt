package com.androidai.framework.theme.sandroid.ui.data.model

import com.androidai.framework.theme.sandroid.ui.Mode

data class DefaultThemeInfo(
        val mode : Int, val actionColor : Int, val isDynamicThemeEnabled : Boolean) {

    companion object{
        fun getDefault() = DefaultThemeInfo(Mode.SYSTEM_DEFAULT.value, 1, false)
    }
}