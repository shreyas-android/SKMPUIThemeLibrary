package com.androidai.framework.theme.sandroid.ui

import android.content.Context
import com.russhwolf.settings.Settings
import com.russhwolf.settings.SharedPreferencesSettings

/*
actual fun getDataStore(context: Any?): DataStore<Preferences> =
    if(context !is Context)
        throw IllegalStateException("You must provide context for Android")
    else createDataStore(
        producePath = { context.filesDir.resolve(dataStoreFileName).absolutePath }
    )
*/


actual fun getSettingsFactory(context: Any?): Settings.Factory {
    if(context !is Context) {
        throw IllegalStateException("You must provide context for Android")
    }
    else {
        /* val masterKey = MasterKey.Builder(context).setKeyScheme(KeyScheme.AES256_GCM).build()

         val encryptedPreferences = EncryptedSharedPreferences.create(
             context, context.packageName + "_encrypted_preferences", masterKey,
             EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
             EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM)

         return SharedPreferencesSettings(encryptedPreferences)*/
       return SharedPreferencesSettings.Factory(context)
    }
}

