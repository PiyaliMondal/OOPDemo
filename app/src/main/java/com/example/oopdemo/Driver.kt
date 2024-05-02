package com.example.oopdemo

import android.util.Log

class Driver(name : String, credit : Int) {
    var driverName = ""
    var totalCredit = 50
    // assign constructor parameter to a variable
    init {
        driverName = name
        totalCredit += credit
    }
    fun showDetails() {
        Log.i("MyTag","Name of the driver is $driverName with $totalCredit credits")
    }
}