import org.gradle.kotlin.dsl.kotlin
import org.gradle.api.artifacts.dsl.DependencyHandler

object ApplicationDependencies {

    const val stdlibLibrary = "stdlib"
    const val stdlibCommonLibrary = "stdlib-common"
    const val stdlibJdk7Library = "stdlib-jdk7"
    const val stdlibJdk8Library = "stdlib-jdk8"
    const val javaReflectKotlinLibrary = "reflect"

    object Versions {
        const val kotlinVersion = "1.5.0"
        const val gradlePluginVersion = "4.2.0-rc01"
        const val gradleKotlinPluginVersion = "1.5.0"
        const val kotlinJvmTargetVersion = "1.8"
        const val kotlinDateTimeJvmVersion = "0.1.0"
    }

}

fun DependencyHandler.applyJdkDependencies() {
    add("implementation", kotlin(ApplicationDependencies.stdlibCommonLibrary, version = ApplicationDependencies.Versions.kotlinVersion))
    add("implementation", kotlin(ApplicationDependencies.stdlibJdk7Library, version = ApplicationDependencies.Versions.kotlinVersion))
    add("implementation", kotlin(ApplicationDependencies.stdlibJdk8Library, version = ApplicationDependencies.Versions.kotlinVersion))
    add("implementation", kotlin(ApplicationDependencies.javaReflectKotlinLibrary, version = ApplicationDependencies.Versions.kotlinVersion))
    add("implementation", kotlin(ApplicationDependencies.stdlibLibrary, version = ApplicationDependencies.Versions.kotlinVersion))
}
