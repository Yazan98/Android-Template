/**
 * This File Include All ClassPaths And Plugins Applied In Each Module
 */
object ApplicationPlugins {

    const val gradleNamePlugin = "gradle-plugin"
    const val firebaseNamePlugin = "com.google.gms.google-services"
    const val androidApplicationPlugin = "com.android.application"
    const val kotlinAndroidPlugin = "android"
    const val kotlinKaptPlugin = "kapt"
    const val firebaseCrashlyticsPlugin = "com.google.firebase.crashlytics"
    const val libraryPlugin = "com.android.library"
    const val navigationPlugin = "androidx.navigation.safeargs.kotlin"
    const val RealmPlugin = "realm-android"

    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${ApplicationDependencies.Versions.kotlinVersion}"
    const val gradlePlugin = "com.android.tools.build:gradle:${ApplicationDependencies.Versions.gradlePluginVersion}"
    const val firebasePlugin = "com.google.gms:google-services:${ApplicationDependencies.Versions.firebasePluginVersion}"
    const val navigationComponentPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${ApplicationDependencies.Versions.navigationPluginVersion}"
    const val realmPlugin = "io.realm:realm-gradle-plugin:${ApplicationDependencies.Versions.realmPluginVersion}"

    object ResolverLinks {
        const val JitpackLink = "https://jitpack.io"
        const val OssLocalSnapshotLink = "http://oss.jfrog.org/artifactory/oss-snapshot-local"
        const val gradlePortalLink = "https://plugins.gradle.org/m2/"
    }
}
