package com.example.backgroundmodetest

import android.app.Application
import com.iristick.sdk.IristickSDK

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        IristickSDK.setup(this)
    }
}