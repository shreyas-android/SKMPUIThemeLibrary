@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    id("kotlin-parcelize")
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose.multiplatform)
    id("io.github.shreyas-android.maven-publish") version "1.0.1"

}

kotlin {
    jvm()

    wasmJs {
        browser()
        nodejs()
        binaries.executable()
    }

    androidTarget {
        compilations.all {
            compileTaskProvider.configure {
                compilerOptions.jvmTarget.set(JvmTarget.JVM_1_8)
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "SAndroidUI"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.cmp.compose.ui)
                implementation(libs.cmp.compose.runtime)
                implementation(libs.cmp.compose.material3)
                implementation(libs.cmp.compose.foundation)
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
                implementation("com.russhwolf:multiplatform-settings:1.3.0")
                implementation("com.russhwolf:multiplatform-settings-no-arg:1.3.0")
                implementation("org.jetbrains.compose.components:components-resources:1.9.3")
            }
        }
    }
}

android {
    namespace = "com.androidai.framework.theme.sandroid.ui"
    compileSdk = 34

    defaultConfig { minSdk = 24 }

    buildFeatures { compose = true }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
    }
}

libraryPublish {
    groupId.set("io.github.shreyas-android")
    artifactId.set("sandroidui")
    version.set("1.0.1")
    libraryName.set("SAndroidUIThemee")
    libraryDescription.set("Compose Multiplatform Theme Library")
    githubUrl.set("https://github.com/shreyas-android/SKMPUIThemeLibrary")
}


/**
 * Compose resources
 */
compose.resources {
    publicResClass = true
    packageOfResClass = "com.androidai.framework.theme.sandroid"
    generateResClass = always
}
