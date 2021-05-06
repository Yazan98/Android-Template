package com.template.android.app

import androidx.appcompat.app.AppCompatDelegate
import androidx.multidex.MultiDexApplication
import com.google.firebase.FirebaseApp
import com.google.firebase.analytics.FirebaseAnalytics
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber

class AppTemplate : MultiDexApplication(),  Thread.UncaughtExceptionHandler {

    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        Thread.setDefaultUncaughtExceptionHandler(this)
        GlobalScope.launch {
            initFirebase()
            initTimber()
        }
    }

    private suspend fun initTimber() {
        withContext(Dispatchers.IO) {
            if (BuildConfig.DEBUG) {
                Timber.plant(Timber.DebugTree())
            } else {
                Timber.plant(CrashReporting())
            }
        }
    }

    private suspend fun initFirebase() {
        withContext(Dispatchers.IO) {
            FirebaseApp.initializeApp(this@AppTemplate)
            FirebaseAnalytics.getInstance(this@AppTemplate)
        }
    }

    override fun uncaughtException(t: Thread, e: Throwable) {

    }
}
