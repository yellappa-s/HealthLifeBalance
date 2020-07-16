package com.example.healthassist.ui.home
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Images(
    val imageSrc : Int,
    val imageTitle: String,
    val imageDesc : String
) : Parcelable
