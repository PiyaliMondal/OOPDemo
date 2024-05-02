package com.example.oopdemo

import android.util.Log

open class Car {

    var maxspeed = 30
    open fun start()
    {
        Log.i("MyTag","Car is starting")
        Log.i("MyTag","Maximum speed is $maxspeed")
    }
}