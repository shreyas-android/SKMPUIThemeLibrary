package com.android.ai.theme.avandroidui

import android.app.Application
import android.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.androidai.framework.theme.sandroid.ui.Mode
import com.androidai.framework.theme.sandroid.ui.SAndroidThemeCore
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIColorCodes
import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo
import com.google.android.material.color.DynamicColors

class MainApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        SAndroidThemeCore.init(this, DefaultThemeInfo(Mode.SYSTEM_DEFAULT.value, SAndroidUIColorCodes.ColorActionViolet.toArgb(),
            false))
    }
}