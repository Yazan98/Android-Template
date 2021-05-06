
plugins {
    id(ApplicationPlugins.androidApplicationPlugin)
    kotlin(ApplicationPlugins.kotlinAndroidPlugin)
    kotlin(ApplicationPlugins.kotlinKaptPlugin)
}

val googleServicesFile = File("google-services.json")
if (googleServicesFile.exists()) {
    apply(plugin = ApplicationPlugins.firebaseNamePlugin)
    apply(plugin = ApplicationPlugins.firebaseCrashlyticsPlugin)
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId("com.template.android.app")
        minSdkVersion(23)
        targetSdkVersion(30)
        versionCode(1)
        versionName("1.0")
        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

//    buildTypes {
//        release {
//            minifyEnabled false
//            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
//        }
//    }
//    compileOptions {
//        sourceCompatibility JavaVersion.VERSION_1_8
//        targetCompatibility JavaVersion.VERSION_1_8
//    }
//    kotlinOptions {
//        jvmTarget = '1.8'
//    }
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