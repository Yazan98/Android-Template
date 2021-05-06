package com.template.android.app

import android.content.Context
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatDelegate

object ColorMode {

    @JvmStatic
    fun applyNewMode(mode: ColorModeType = ColorModeType.DEFAULT, context: Context? = null) {
        when (mode) {
            ColorModeType.DEFAULT -> applySystemDefaultMode(context)
            ColorModeType.NIGHT -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            ColorModeType.LIGHT -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }

    private fun applySystemDefaultMode(context: Context?) {
        if (context == null) {
            return
        }

        val nightModeFlags: Int = context.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        if (nightModeFlags == Configuration.UI_MODE_NIGHT_YES) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }

    enum class ColorModeType {
        LIGHT, NIGHT, DEFAULT
    }

}