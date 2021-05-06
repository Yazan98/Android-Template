package com.template.android.app

import timber.log.Timber

class CrashReporting : Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {

    }
}