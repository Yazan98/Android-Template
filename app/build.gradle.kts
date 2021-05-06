import com.yazantarifi.android.template.ApplicationInfo

plugins {
    id(ApplicationPlugins.androidApplicationPlugin)
    kotlin(ApplicationPlugins.kotlinAndroidPlugin)
    kotlin(ApplicationPlugins.kotlinKaptPlugin)
    id(ApplicationPlugins.RealmPlugin)
    id(ApplicationPlugins.navigationPlugin)
}

val googleServicesFile = File("google-services.json")
if (googleServicesFile.exists()) {
    apply(plugin = ApplicationPlugins.firebaseNamePlugin)
    apply(plugin = ApplicationPlugins.firebaseCrashlyticsPlugin)
}

android {

    compileSdkVersion(ApplicationInfo.ApplicationTargetVersion)
    buildToolsVersion(ApplicationInfo.buildToolsVersion)
    useLibrary(ApplicationInfo.httpLegacy)

    defaultConfig {
        applicationId(ApplicationInfo.ApplicationPackageName)
        minSdkVersion(ApplicationInfo.ApplicationMinSdkVersion)
        targetSdkVersion(ApplicationInfo.ApplicationTargetVersion)
        versionCode(ApplicationInfo.ApplicationVersionCode)
        versionName(ApplicationInfo.ApplicationVersionName)
        manifestPlaceholders(ApplicationInfo.getManifestPlaceHolders())
        testInstrumentationRunner(ApplicationInfo.AndroidJunitRunner)
        resConfigs("en", "ar")
        multiDexEnabled = true
    }

//    buildTypes {
//        release {
//            minifyEnabled false
//            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
//        }
//    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

dependencies {
    applyJdkDependencies()
    applyUserInterfaceLibraries()
    applyTestingLibraries()
    applyApplicationConfiguration()
    applyKotlinCoroutinesConfiguration()
    applyDataConfiguration()
    applyLifecycleConfiguration()
    applyGooglePlayServicesConfiguration()
    applyFirebaseConfiguration()
}
