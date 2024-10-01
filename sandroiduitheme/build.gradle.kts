import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    kotlin("native.cocoapods")
    id("maven-publish")
}

version = "1.0.0"
group = "com.androidai.framework.theme.sandroid.ui"

kotlin {

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "11"
            }
        }
    }


    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64(),

        ).forEach {
        it.binaries.framework {
            baseName = "SAndroidUITheme"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.atomicfu)
                api(libs.datastore.core)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val androidMain by getting {
            dependencies {
                implementation(libs.compose.ui.ui)
                implementation(libs.compose.foundation.foundation)
                implementation(libs.compose.ui.uitextfonts)
                implementation(libs.compose.material)
                implementation(libs.compose.material3)
                implementation(libs.material)

            }
        }

        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

android {
    namespace = "com.androidai.framework.theme.sandroid.ui"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }

    buildFeatures {
        compose=true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }
}

afterEvaluate {
    publishing{
        publications {
            create<MavenPublication>("release") {
                groupId = "com.androidai.framework.theme"
                artifactId = "sandroid-ui"
                version = "1.0.0"

                afterEvaluate {
                    from(components["release"])
                }
            }
        }
    }
}

task("testClasses").doLast {
    println("This is a dummy testClasses task")
}
