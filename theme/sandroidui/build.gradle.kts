import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

plugins {
    id("maven-publish")
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    id("kotlin-parcelize")
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose.multiplatform)


}

version = "1.0.0"
group = "com.androidai.framework.theme"

kotlin {

    jvm()
    androidTarget {
        compilations.all {
            compileTaskProvider.configure {
                compilerOptions {
                    jvmTarget.set(JvmTarget.JVM_1_8)
                }
            }
        }
    }


    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64(),

        ).forEach {
        it.binaries.framework {
            baseName = "SAndroidUI"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {

                implementation(libs.atomicfu)

                implementation(libs.cmp.compose.ui)
                implementation(libs.cmp.compose.runtime)
                implementation(libs.cmp.compose.material3)
                implementation(libs.cmp.compose.foundation)
                implementation("androidx.datastore:datastore:1.1.7")
                implementation("androidx.datastore:datastore-preferences:1.1.7")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
                implementation("com.russhwolf:multiplatform-settings:1.0.0")
                implementation("com.russhwolf:multiplatform-settings-no-arg:1.0.0")
                implementation("org.jetbrains.compose.components:components-resources:1.9.3")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val androidMain by getting {
            dependencies {
                /*implementation(libs.compose.ui.ui)
                implementation(libs.compose.foundation.foundation)
                implementation(libs.compose.ui.uitextfonts)
                implementation(libs.compose.material)
                implementation(libs.compose.material3)
                implementation(libs.material)*/

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

    /*compose.resources {
        publicResClass = true
    }*/
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

}


afterEvaluate {
    publishing{
        publications {
          /*  create<MavenPublication>("release") {
                groupId = "com.androidai.framework.theme"
                artifactId = "sandroidui"
                version = "1.0.0"

                afterEvaluate {
                    from(components["release"])
                }
            }*/
        }
    }
}

compose.resources {
    publicResClass = true
    packageOfResClass = "com.androidai.framework.theme.sandroid"
    generateResClass = always
}



