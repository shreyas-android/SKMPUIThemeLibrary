package com.androidai.framework.theme.sandroid.ui.datastore// shared/src/iosMain/kotlin/CreateDataStore.ios.kt
import kotlinx.cinterop.ExperimentalForeignApi
import platform.Foundation.NSFileManager
import platform.Foundation.NSUserDomainMask
import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSURL

/*@OptIn(ExperimentalForeignApi::class)
fun createIOSDataStore() = createDataStore(
  producePath = {
    val documentDirectory: NSURL? = NSFileManager.defaultManager.URLForDirectory(
      directory = NSDocumentDirectory,
      inDomain = NSUserDomainMask,
      appropriateForURL = null,
      create = false,
      error = null
    )
    requireNotNull(documentDirectory).path + "/$dataStoreFileName"
  }
)*/
