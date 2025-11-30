@file:OptIn(ExperimentalWasmDsl::class)

import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    id("kotlin-parcelize")
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose.multiplatform)
    id("com.vanniktech.maven.publish") version "0.30.0"

}

version = "1.0.1"
group = "com.androidai.framework.theme"

kotlin {
    jvm()

    wasmJs {
        browser()
        nodejs()
        binaries.executable()
    }

    androidTarget {
        publishLibraryVariants("release")

        compilations.all {
            compileTaskProvider.configure {
                compilerOptions.jvmTarget.set(JvmTarget.JVM_1_8)
            }
        }
        publishLibraryVariants("release", "debug")
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

mavenPublishing {
    coordinates(
        groupId = "io.github.shreyas-android",
        artifactId = "sandroidui",
        version = "1.0.1"
    )

    // Configure POM metadata for the published artifact
    pom {
        name.set("SAndroidUITheme")
        description.set("Compose Multiplatform Theme Library")
        url.set("https://github.com/shreyas-android/SKMPUIThemeLibrary")


        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
            }
        }

        // Specify developers information
        developers {
            developer {
                id.set("shreyas")
                name.set("Shreyas Android")
                email.set("avengers14.blogger@gmail.com")
            }
        }

        // Specify SCM information
        scm {
            url.set("https://github.com/shreyas-android/SKMPUIThemeLibrary")
        }
    }

    // Configure publishing to Maven Central
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    // Enable GPG signing for all publications
    signAllPublications()
}


/**
 * Compose resources
 */
compose.resources {
    publicResClass = true
    packageOfResClass = "com.androidai.framework.theme.sandroid"
    generateResClass = always
}
