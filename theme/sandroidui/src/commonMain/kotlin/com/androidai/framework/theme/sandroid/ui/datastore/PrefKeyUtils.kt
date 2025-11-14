package com.androidai.framework.theme.sandroid.ui.datastore

import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey

object PrefKeyUtils {

    val preferencesModeKey = intPreferencesKey("mode_pref")
    val preferencesActionColorKey = intPreferencesKey("action_color_pref")
    val preferencesDynamicColorKey = booleanPreferencesKey("dynamic_color_pref")

}