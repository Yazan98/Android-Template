package com.yazantarifi.android.template

object ApplicationInfo {

    const val ApplicationTargetVersion = 30
    const val ApplicationMinSdkVersion = 26
    const val ApplicationVersionCode = 1
    const val ApplicationVersionName = "1.0.0"
    const val httpLegacy = "org.apache.http.legacy"
    const val buildToolsVersion = "30.0.0"
    const val AndroidJunitRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val ApplicationPackageName = "com.template.android.app"

    fun getManifestPlaceHolders() : MutableMap<String, Any> {
        return hashMapOf(
            Pair("enableCrashReporting", "false"),
            Pair("CrashReportingApiKey", "ApiKeyHere"),
            Pair("GoogleMapsApiKey", "GoogleMapsApiKey")
        )
    }

}
