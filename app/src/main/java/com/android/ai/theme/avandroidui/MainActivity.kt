package com.android.ai.theme.avandroidui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
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
            SAndroidAppearanceScreen(themeManager)
        }
    }
}