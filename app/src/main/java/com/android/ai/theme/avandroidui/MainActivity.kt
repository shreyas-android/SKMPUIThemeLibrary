package com.android.ai.theme.avandroidui

import android.graphics.Color
import android.os.Bundle
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import com.androidai.framework.feature.sandroid.ui.SAndroidAppearanceScreen
import com.androidai.framework.theme.sandroid.ui.SCommonThemeCore

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            val themeManager = remember {
                SCommonThemeCore.getThemeManager()
            }

            // The system bars are drawn by the platform, so their icons have to be flipped
            // manually. Otherwise light icons stay on the white background (and vice versa) when
            // the selected theme does not match the system one.
            val isNightMode = themeManager.getIsNightModeFlow().collectAsState().value
            LaunchedEffect(isNightMode) {
                applySystemBarStyle(isNightMode)
            }

            SAndroidAppearanceScreen(themeManager)
        }
    }

    private fun applySystemBarStyle(isNightMode : Boolean) {
        val systemBarStyle = if(isNightMode) {
            SystemBarStyle.dark(Color.TRANSPARENT)
        } else {
            SystemBarStyle.light(Color.TRANSPARENT, Color.TRANSPARENT)
        }
        enableEdgeToEdge(statusBarStyle = systemBarStyle, navigationBarStyle = systemBarStyle)
    }
}
