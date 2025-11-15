@file:OptIn(ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

plugins {

    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    id("kotlin-parcelize")
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.compose.multiplatform)
    id("maven-publish")
    id("signing")



}

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
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
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
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
    }

}

/*publishing {
    publications.withType<MavenPublication>().configureEach {
        artifactId = "sandroidui"
        pom {
            name.set("SKMPUIThemeLibrary")
            description.set("Compose Multiplatform UI Theme Library")
            url.set("https://github.com/shreyas-android/SKMPUIThemeLibrary")
            licenses {
                license { name.set("Apache-2.0") }
            }
        }
    }
}*/

publishing {
    publications.withType<MavenPublication>().configureEach {
        artifactId = "sandroidui"

        pom {
            name.set("SAndroidUITheme")
            description.set("Compose Multiplatform Theme Library")
            url.set("https://github.com/shreyas-android/SKMPUIThemeLibrary")

            licenses {
                license {
                    name.set("Apache-2.0")
                    url.set("https://www.apache.org/licenses/LICENSE-2.0")
                }
            }

            scm {
                connection.set("scm:git:git://github.com/shreyas-android/SKMPUIThemeLibrary.git")
                developerConnection.set("scm:git:ssh://github.com/shreyas-android/SKMPUIThemeLibrary.git")
                url.set("https://github.com/shreyas-android/SKMPUIThemeLibrary")
            }

            developers {
                developer {
                    id.set("shreyas")
                    name.set("Shreyas Android")
                    email.set("avengers14.blogger@gmail.com")
                }
            }
        }
    }

    repositories {
        maven {
            name = "central"
            url = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            credentials {
                username = project.findProperty("ossrhUsername") as String?
                password = project.findProperty("ossrhPassword") as String?
            }
        }
    }
}

signing {
    useInMemoryPgpKeys(
        project.findProperty("SIGNING_KEY") as String?,
        project.findProperty("SIGNING_PASSWORD") as String?
    )
    sign(publishing.publications)
}



compose.resources {
    publicResClass = true
    packageOfResClass = "com.androidai.framework.theme.sandroid"
    generateResClass = always
}



