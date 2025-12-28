plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.compose.compiler)
    id("kotlin-parcelize")
    alias(libs.plugins.kotlinSerialization)
    id("io.github.shreyas-android.android-signing") version "1.0.1"
}

android {
    namespace = "com.android.ai.theme.avandroidui"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.android.ai.theme.avandroidui"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        compose= true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.scompose.activity)
    implementation(libs.scompose.constraintlayout)
    implementation(libs.scompose.material)
    implementation(libs.scompose.foundation.foundation)
    implementation(libs.scompose.viewmodel)
    implementation(libs.scompose.material3)

    implementation(project(":feature:sandroidui"))
    implementation(project(":theme:sandroidui"))
    // implementation("com.github.shreyas-android:SKMPUIThemeLibrary:1.0.0")
}