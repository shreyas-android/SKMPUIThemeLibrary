package com.androidai.framework.theme.sandroid.ui.datastore

import android.content.Context

fun createAndroidDataStore(context: Context) = createDataStore(
  producePath = { context.filesDir.resolve(dataStoreFileName).absolutePath }
)
