import com.yazantarifi.android.template.ApplicationInfo

android {

    compileSdkVersion(ApplicationInfo.ApplicationTargetVersion)
    buildToolsVersion(ApplicationInfo.buildToolsVersion)

    defaultConfig {
        minSdkVersion(ApplicationInfo.ApplicationMinSdkVersion)
        targetSdkVersion(ApplicationInfo.ApplicationTargetVersion)
        versionCode(ApplicationInfo.ApplicationVersionCode)
        versionName(ApplicationInfo.ApplicationVersionName)
        testInstrumentationRunner(ApplicationInfo.AndroidJunitRunner)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

dependencies {
    applyDataConfiguration()
}
