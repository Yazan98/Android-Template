import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.kotlin

object ApplicationDependencies {

    // Common JDK Libraries
    const val stdlibLibrary = "stdlib"
    const val stdlibCommonLibrary = "stdlib-common"
    const val stdlibJdk7Library = "stdlib-jdk7"
    const val stdlibJdk8Library = "stdlib-jdk8"
    const val javaReflectKotlinLibrary = "reflect"

    // Android User Interface Libraries
    const val androidCore = "androidx.core:core-ktx:${Versions.androidCoreVersion}"
    const val androidAppCompat = "androidx.appcompat:appcompat:${Versions.androidAppCompatVersion}"
    const val androidMaterialUILibrary = "com.google.android.material:material:${Versions.androidMaterialUIVersion}"
    const val constraintLayoutLibrary = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val recyclerViewLibrary = "androidx.recyclerview:recyclerview:${Versions.supportLibraryVersion}"
    const val supportCompatLibrary = "com.android.support:support-compat:${Versions.supportLibraryVersion}"
    const val supportCoreLibrary = "com.android.support:support-core-utils:${Versions.supportLibraryVersion}"
    const val supportCoreUILibrary = "com.android.support:support-core-ui:${Versions.supportLibraryVersion}"
    const val fragmentLibrary = "com.android.support:support-fragment:${Versions.supportLibraryVersion}"
    const val androidCoreLibrary = "androidx.core:core-ktx:${Versions.supportLibraryVersion}"
    const val cardViewLibrary = "androidx.cardview:cardview:${Versions.supportLibraryVersion}"
    const val frescoLibrary = "com.facebook.fresco:fresco:${Versions.frescoVersion}"
    const val navigationFragmentKotlinLibrary = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationSystemVersion}"
    const val navigationFragmentKotlinUILibrary = "androidx.navigation:navigation-ui-ktx:${Versions.navigationSystemVersion}"

    // Testing Libraries
    const val junitLibrary = "junit:junit:${Versions.junitVersion}"
    const val junitExtsLibrary = "androidx.test.ext:junit:${Versions.junitExtsVersion}"
    const val esspressoLibrary = "androidx.test.espresso:espresso-core:${Versions.esspressoVersion}"

    // Application Configuration
    const val timberLibrary = "com.jakewharton.timber:timber:${Versions.timberVersion}"
    const val multiDexMergeLibrary = "com.android.support:multidex:${Versions.multiDexMergeVersion}"
    const val leakCanaryAndroidLibrary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanaryVersion}"
    const val leakCanaryLibrary = "com.squareup.leakcanary:leaksentry:${Versions.leakCanaryVersion}"
    const val androidSupportUtils = "com.android.support:support-core-utils:${Versions.supportUtilsVersion}"

    // Multi Threading
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
    const val androidCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"

    // Data Configuration
    const val Retrofit = "com.squareup.retrofit2:retrofit:${Versions.RetrofitV}"
    const val RetrofitRxJavaAdapter = "com.squareup.retrofit2:retrofit:${Versions.RetrofitV}"
    const val RetrofitIntercenptor  = "com.squareup.retrofit2:retrofit:${Versions.RetrofitiInterceptorV}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:retrofit:${Versions.RetrofitGsonAdapterV}"
    const val RxJava = "com.squareup.retrofit2:retrofit:${Versions.RxJavaV}"
    const val RxAndroid = "com.squareup.retrofit2:retrofit:${Versions.RxAndroidV}"

    // Lifecycle
    const val LifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
    const val LifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleVersion}"
    const val LifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleVersion}"
    const val LifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
    const val LifecycleCommon = "androidx.lifecycle:lifecycle-common:${Versions.lifecycleVersion}"

    // Google Services
    const val GoogleMaps = "com.google.android.gms:play-services-maps:${Versions.googlePlayServicesV}"
    const val GooglePlaces = "com.google.android.gms:play-services-places:${Versions.googlePlayServicesV}"
    const val GoogleGcm = "com.google.android.gms:play-services-gcm:${Versions.googlePlayServicesV}"
    const val GoogleLocations = "com.google.android.gms:play-services-location:${Versions.googlePlayServicesV}"

    // Firebase
    const val FirebaseMessaging = "com.google.firebase:firebase-messaging:${Versions.FirebaseMessagingV}"
    const val FirebaseAnalytics = "com.google.firebase:firebase-analytics-ktx:${Versions.FirebaseAnalyticsV}"
    const val FirebaseAuth = "com.google.firebase:firebase-auth-ktx:${Versions.FirebaseAuthV}"
    const val FirebaseCrashes = "com.google.firebase:firebase-crashlytics-ktx${Versions.FirebaseCrashesV}"

    object Versions {
        const val kotlinVersion = "1.5.0"
        const val gradlePluginVersion = "4.2.0-rc01"
        const val gradleKotlinPluginVersion = "1.5.0"
        const val firebasePluginVersion = "4.3.5"
        const val navigationPluginVersion = "2.2.0-rc04"
        const val realmPluginVersion = "7.0.0-beta-SNAPSHOT"

        const val kotlinJvmTargetVersion = "1.8"
        const val androidCoreVersion = "1.3.2"
        const val androidAppCompatVersion = "1.2.0"
        const val androidMaterialUIVersion = "1.3.0"
        const val constraintLayoutVersion = "2.0.4"

        const val junitVersion = "4.13.2"
        const val junitExtsVersion = "1.1.2"
        const val esspressoVersion = "3.3.0"

        const val timberVersion = "4.7.1"
        const val multiDexMergeVersion = "1.0.3"
        const val leakCanaryVersion = "2.0-alpha-1"
        const val supportUtilsVersion = "28.0.0"

        const val supportLibraryVersion = "1.0.0"
        const val coroutinesVersion = "1.3.3"
        const val frescoVersion = "2.1.0"
        const val navigationSystemVersion = "2.2.0-rc04"

        const val RetrofitV = "2.6.1"
        const val RxJavaV = "2.2.11"
        const val RxAndroidV = "2.1.1"
        const val RetrofitiInterceptorV = "3.12.1"
        const val RetrofitGsonAdapterV = "2.5.0"
        const val lifecycleVersion = "2.3.1"
        const val googlePlayServicesV = "16.0.0"
        const val FirebaseAnalyticsV = "18.0.3"
        const val FirebaseMessagingV = "21.0.1"
        const val FirebaseAuthV = "20.0.4"
        const val FirebaseCrashesV = "20.0.4"
    }

}

fun DependencyHandler.applyJdkDependencies() {
    add("implementation", kotlin(ApplicationDependencies.stdlibCommonLibrary, version = ApplicationDependencies.Versions.kotlinVersion))
    add("implementation", kotlin(ApplicationDependencies.stdlibJdk7Library, version = ApplicationDependencies.Versions.kotlinVersion))
    add("implementation", kotlin(ApplicationDependencies.stdlibJdk8Library, version = ApplicationDependencies.Versions.kotlinVersion))
    add("implementation", kotlin(ApplicationDependencies.javaReflectKotlinLibrary, version = ApplicationDependencies.Versions.kotlinVersion))
    add("implementation", kotlin(ApplicationDependencies.stdlibLibrary, version = ApplicationDependencies.Versions.kotlinVersion))
}

fun DependencyHandler.applyUserInterfaceLibraries() {
    add("implementation", ApplicationDependencies.androidCore)
    add("implementation", ApplicationDependencies.androidAppCompat)
    add("implementation", ApplicationDependencies.androidMaterialUILibrary)
    add("implementation", ApplicationDependencies.constraintLayoutLibrary)
    add("implementation", ApplicationDependencies.recyclerViewLibrary)
    add("implementation", ApplicationDependencies.supportCompatLibrary)
    add("implementation", ApplicationDependencies.supportCoreLibrary)
    add("implementation", ApplicationDependencies.supportCoreUILibrary)
    add("implementation", ApplicationDependencies.fragmentLibrary)
    add("implementation", ApplicationDependencies.androidCoreLibrary)
    add("implementation", ApplicationDependencies.cardViewLibrary)
    add("implementation", ApplicationDependencies.frescoLibrary)
    add("implementation", ApplicationDependencies.navigationFragmentKotlinLibrary)
    add("implementation", ApplicationDependencies.navigationFragmentKotlinUILibrary)
}

fun DependencyHandler.applyTestingLibraries() {
    add("testImplementation", ApplicationDependencies.junitLibrary)
    add("androidTestImplementation", ApplicationDependencies.junitExtsLibrary)
    add("androidTestImplementation", ApplicationDependencies.esspressoLibrary)
}

fun DependencyHandler.applyApplicationConfiguration() {
    add("implementation", ApplicationDependencies.timberLibrary)
    add("implementation", ApplicationDependencies.multiDexMergeLibrary)
    add("implementation", ApplicationDependencies.androidSupportUtils)
    add("debugImplementation", ApplicationDependencies.leakCanaryAndroidLibrary)
    add("debugImplementation", ApplicationDependencies.leakCanaryLibrary)
}

fun DependencyHandler.applyKotlinCoroutinesConfiguration() {
    add("implementation", ApplicationDependencies.coroutinesCore)
    add("implementation", ApplicationDependencies.androidCoroutines)
}

fun DependencyHandler.applyDataConfiguration() {
    add("implementation", ApplicationDependencies.Retrofit)
    add("implementation", ApplicationDependencies.RetrofitRxJavaAdapter)
    add("implementation", ApplicationDependencies.RetrofitIntercenptor)
    add("implementation", ApplicationDependencies.retrofitGsonConverter)
    add("implementation", ApplicationDependencies.RxJava)
    add("implementation", ApplicationDependencies.RxAndroid)
}

fun DependencyHandler.applyLifecycleConfiguration() {
    add("implementation", ApplicationDependencies.LifecycleViewModel)
    add("implementation", ApplicationDependencies.LifecycleExtensions)
    add("kapt", ApplicationDependencies.LifecycleRuntime)
    add("implementation", ApplicationDependencies.LifecycleLiveData)
    add("implementation", ApplicationDependencies.LifecycleCommon)
    add("implementation", ApplicationDependencies.RxAndroid)
}

fun DependencyHandler.applyGooglePlayServicesConfiguration() {
    add("implementation", ApplicationDependencies.GoogleMaps)
    add("implementation", ApplicationDependencies.GooglePlaces)
    add("implementation", ApplicationDependencies.GoogleGcm)
    add("implementation", ApplicationDependencies.GoogleLocations)
}

fun DependencyHandler.applyFirebaseConfiguration() {
    add("implementation", ApplicationDependencies.FirebaseMessaging)
    add("implementation", ApplicationDependencies.FirebaseAnalytics)
    add("implementation", ApplicationDependencies.FirebaseAuth)
    add("implementation", ApplicationDependencies.FirebaseCrashes)
}
