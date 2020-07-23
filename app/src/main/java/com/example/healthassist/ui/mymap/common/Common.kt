package com.example.healthassist.ui.mymap.common

import com.example.healthassist.ui.mymap.Remote.IGoogleAPIServices
import com.example.healthassist.ui.mymap.Remote.RetrofitClient

object Common {

    private val GOOGLE_API_URL="https://maps.googleapis.com/"

    val googleApiService:IGoogleAPIServices
        get()= RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIServices::class.java)
}