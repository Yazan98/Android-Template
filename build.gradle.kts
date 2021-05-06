/**
 * Root Application Configuration File To Configure Plugins , Shared Things With All Modules
 */

import ApplicationDependencies
import ApplicationPlugins

buildscript {

    repositories {
        google()
        mavenCentral()
        maven(url = ApplicationPlugins.ResolverLinks.JitpackLink)
        maven(url = ApplicationPlugins.ResolverLinks.OssLocalSnapshotLink)
        maven(url = ApplicationPlugins.ResolverLinks.gradlePortalLink)
    }

    dependencies {
        classpath(ApplicationPlugins.gradlePlugin)
        classpath(ApplicationPlugins.kotlinPlugin)
        classpath(ApplicationPlugins.firebasePlugin)
        classpath(ApplicationPlugins.navigationComponentPlugin)
        classpath(ApplicationPlugins.realmPlugin)
        classpath(ApplicationPlugins.firebaseCrashesPlugin)
        classpath(kotlin(ApplicationPlugins.gradleNamePlugin, version = ApplicationDependencies.Versions.gradleKotlinPluginVersion))
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(url = ApplicationPlugins.ResolverLinks.JitpackLink)
        maven(url = ApplicationPlugins.ResolverLinks.OssLocalSnapshotLink)
        maven(url = ApplicationPlugins.ResolverLinks.gradlePortalLink)
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
