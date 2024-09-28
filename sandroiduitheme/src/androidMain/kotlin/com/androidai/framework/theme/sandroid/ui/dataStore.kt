package com.androidai.framework.theme.sandroid.ui

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences

actual fun getDataStore(context: Any?): DataStore<Preferences> =
    if(context !is Context)
        throw IllegalStateException("You must provide context for Android")
    else createDataStore(
        producePath = { context.filesDir.resolve(dataStoreFileName).absolutePath }
    )

