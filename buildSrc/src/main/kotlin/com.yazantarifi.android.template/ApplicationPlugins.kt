/**
 * This File Include All ClassPaths And Plugins Applied In Each Module
 */
object ApplicationPlugins {

    const val gradleNamePlugin = "gradle-plugin"

    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${ApplicationDependencies.Versions.kotlinVersion}"
    const val gradlePlugin = "com.android.tools.build:gradle:${ApplicationDependencies.Versions.gradlePluginVersion}"
    const val kotlinDateTimePlugin = "org.jetbrains.kotlinx:kotlinx-datetime-jvm:${ApplicationDependencies.Versions.kotlinDateTimeJvmVersion}"
}