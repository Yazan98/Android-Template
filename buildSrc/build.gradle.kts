
repositories {
    mavenCentral()
    google()
    maven("https://kotlin.bintray.com/kotlinx/")
}

plugins {
    kotlin("jvm") version "1.5.0"
    `kotlin-dsl`
    `java-gradle-plugin`
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}
