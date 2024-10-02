package com.androidai.framework.theme.sandroid.ui.ext

import com.androidai.framework.theme.sandroid.ui.Mode

fun Int.toMode() : Mode {
   return when(this){
        Mode.DARK.value -> Mode.DARK
        Mode.LIGHT.value -> Mode.LIGHT
        else -> Mode.SYSTEM_DEFAULT
    }
}