package com.example.healthassist.ui.mymap.Remote

import com.example.healthassist.ui.mymap.Model.MyPlaces
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface IGoogleAPIServices {
    @GET
    fun getNearByPlaces(@Url url:String): Call<MyPlaces>
}