package com.androidai.framework.theme.sandroid.ui


import com.russhwolf.settings.Settings

/*fun createDataStore(
    producePath: () -> String,
): DataStore<Preferences> = PreferenceDataStoreFactory.createWithPath(
    corruptionHandler = null,
    migrations = emptyList(),
    produceFile = { producePath().toPath() },
)

// expect fun getDataStore(context:Any? = null):DataStore<Preferences>*/

expect fun getSettingsFactory(context: Any? = null): Settings.Factory
