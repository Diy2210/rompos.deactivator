package com.rompos.deactivator.app

import android.app.Application
import com.rompos.deactivator.mpp.App

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        mppApplication = App().apply { initialize() }
    }

    companion object {
        lateinit var mppApplication: App
    }
}
