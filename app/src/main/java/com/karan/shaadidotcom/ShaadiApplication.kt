package com.karan.shaadidotcom

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

class ShaadiApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }
}
