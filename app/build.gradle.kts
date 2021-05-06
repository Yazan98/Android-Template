import com.yazantarifi.android.template.ApplicationInfo

plugins {
    id(ApplicationPlugins.androidApplicationPlugin)
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
            buildConfigField("String", project.property("baseUrl") as String, false.toString())
            isDebuggable = true
        }

        create("qa") {
            buildConfigField("String", project.property("baseUrl") as String, true.toString())
            isShrinkResources = true
            isMinifyEnabled = true
            isUseProguard = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }

        getByName("release") {
            buildConfigField("String",  project.property("baseUrl") as String, true.toString())
            isShrinkResources = true
            isMinifyEnabled = true
            isUseProguard = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    productFlavors {
        create("free") {
            applicationId = "application.android.free"
        }

        create("paid") {
            applicationId = "application.android.paid"
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
