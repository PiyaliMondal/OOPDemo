package com.example.oopdemo

import android.util.Log

class MyCar : Car(), SpeedController{
    override fun start() {
        Log.i("Mytag","This is MyCar starting, i.e., overriden and the brand id is ${getBrandId()}")
    }

    override fun accelerate() {
        TODO("Not yet implemented")
    }

    override fun decelerate() {
        TODO("Not yet implemented")
    }
}