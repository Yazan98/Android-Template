import com.yazantarifi.android.template.ApplicationInfo

plugins {
    id(ApplicationPlugins.androidApplicationPlugin)
    id(ApplicationPlugins.kotlinExtsNamePlugin)
    kotlin(ApplicationPlugins.kotlinAndroidPlugin)
    kotlin(ApplicationPlugins.kotlinKaptPlugin)
    id(ApplicationPlugins.RealmPlugin)
    id(ApplicationPlugins.navigationPlugin)
    id(ApplicationPlugins.firebaseCrashlyticsPlugin)
    id(ApplicationPlugins.firebaseNamePlugin)
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

    buildTypes {
        getByName("debug") {
            buildConfigField("String", "baseUrl", project.property("baseUrl") as String)
            isDebuggable = true
        }

        create("qa") {
            buildConfigField("String", "baseUrl", project.property("baseUrl") as String)
            isShrinkResources = true
            isMinifyEnabled = true
            isUseProguard = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }

        getByName("release") {
            buildConfigField("String", "baseUrl", project.property("baseUrl") as String)
            isShrinkResources = true
            isMinifyEnabled = true
            isUseProguard = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

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

    api(project(":data"))
    api(project(":logic"))
    api(project(":domain"))
}
