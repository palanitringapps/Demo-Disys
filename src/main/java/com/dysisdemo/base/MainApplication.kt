package com.dysisdemo.base

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
        Fresco.initialize(this);
    }

    companion object {
        lateinit var instance: MainApplication
            private set
    }
}