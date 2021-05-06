/**
 * Root Application Configuration File To Configure Plugins , Shared Things With All Modules
 */

import ApplicationDependencies
import ApplicationPlugins

buildscript {

    repositories {
        google()
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath(ApplicationPlugins.gradlePlugin)
        classpath(ApplicationPlugins.kotlinPlugin)
        classpath(kotlin(ApplicationPlugins.gradleNamePlugin, version = ApplicationDependencies.Versions.gradleKotlinPluginVersion))
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        kotlinOptions {
            @Suppress("SuspiciousCollectionReassignment")
            jvmTarget = ApplicationDependencies.Versions.kotlinJvmTargetVersion
        }
    }

}

plugins {
    kotlin("jvm") version ApplicationDependencies.Versions.kotlinVersion
    `kotlin-dsl`
    `java-gradle-plugin`
}
