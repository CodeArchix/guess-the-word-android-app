package com.codearchix.guesstheword

import android.app.Application
import timber.log.Timber

class GuessTheWordApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        if(BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
    }
}