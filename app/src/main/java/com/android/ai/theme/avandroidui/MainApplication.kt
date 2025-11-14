package com.android.ai.theme.avandroidui

import android.app.Application
import androidx.compose.ui.graphics.toArgb
import com.androidai.framework.theme.sandroid.ui.SAndroidThemeCore
import com.androidai.framework.theme.sandroid.ui.data.model.enum.Mode
import com.androidai.framework.theme.sandroid.ui.SCommonThemeCore
import com.androidai.framework.theme.sandroid.ui.compose.style.SAndroidUIColorCodes
import com.androidai.framework.theme.sandroid.ui.data.model.DefaultThemeInfo

class MainApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        SAndroidThemeCore.init(this,
            DefaultThemeInfo(Mode.SYSTEM_DEFAULT.value, SAndroidUIColorCodes.ColorActionViolet.toArgb(),
            false))
    }
}