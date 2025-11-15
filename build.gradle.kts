import org.gradle.kotlin.dsl.apply

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.compose.compiler).apply(false)
    // Note: Applying kotlinSerialization here with no .apply(false) means it's applied to the root project itself.
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.compose.multiplatform).apply(false)

    // Publishing plugins - applied to the root project to configure deployment
    id("maven-publish")
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
}

/**
 * Nexus Publishing configuration for Sonatype/Maven Central
 * Uses environment variables OSSRH_USERNAME and OSSRH_PASSWORD.
 */
nexusPublishing {
    repositories {
        sonatype {
            // Publishing to Sonatype
            nexusUrl.set(uri("https://central.sonatype.com/api/v1/publish"))
            snapshotRepositoryUrl.set(uri("https://central.sonatype.com/api/v1/publish"))

            // Authentication using environment variables
            username.set(System.getenv("OSSRH_USERNAME"))
            password.set(System.getenv("OSSRH_PASSWORD"))
        }
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        // JetBrains Compose Dev repository for Multiplatform dependencies
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}