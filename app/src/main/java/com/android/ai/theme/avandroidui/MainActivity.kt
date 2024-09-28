package com.android.ai.theme.avandroidui

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.androidai.framework.feature.sandroid.ui.AppearanceScreen
import com.androidai.framework.feature.sandroid.ui.SAndroidAppearanceScreen
import com.androidai.framework.theme.sandroid.ui.SAndroidThemeCore
import com.androidai.framework.theme.sandroid.ui.SAndroidUITheme
import com.google.android.material.color.DynamicColors

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            val themeManager = remember {
                SAndroidThemeCore.getThemeManager()
            }
            SAndroidAppearanceScreen(themeManager)
        }
    }
}