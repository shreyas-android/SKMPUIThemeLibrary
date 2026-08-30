plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.compose.compiler)
    id("kotlin-parcelize")
//    id("maven-publish")
}

android {
    namespace = "com.androidai.framework.feature.sandroid.ui"
    compileSdk = 36

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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

    /*publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }*/
}

group = "com.androidai.framework.feature"
version = "1.0"

/*
afterEvaluate {
    publishing{
        publications {
            create<MavenPublication>("release") {
                groupId = "com.androidai.framework.feature"
                artifactId = "sandroid-ui"
                version = "1.0.0"

                afterEvaluate {
                    from(components["release"])
                }
            }
        }
    }
}
*/

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)



    //compose
    implementation(libs.scompose.activity)
    implementation(libs.scompose.constraintlayout)
    implementation(libs.scompose.material)
    implementation(libs.scompose.foundation.foundation)
    implementation(libs.scompose.viewmodel)
    implementation(libs.scompose.material3)

  //  implementation("com.github.shreyas-android:SKMPUIThemeLibrary:1.0.0")
    implementation(project(":theme:sandroidui"))
}