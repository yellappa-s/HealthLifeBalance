package com.example.healthassist.ui.mymap

class place(text1: String, text2: String) {

    val name: String = text1
    val addr: String = text2

    internal fun getName(): String? {
        return name
    }

    internal fun getAddr(): String? {
        return addr
    }
}
