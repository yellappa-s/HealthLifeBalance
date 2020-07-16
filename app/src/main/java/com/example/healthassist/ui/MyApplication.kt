package com.example.healthassist.ui

import android.annotation.SuppressLint
import android.app.Application

@SuppressLint("Registered")
@Suppress("unused")
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        DataModel.init(this)
        Notifications.init(this)
    }
}