package com.afterhoursstack.penghitung.feature_counter.data.local

class CounterLocalDataSource {

    private var counter = 0

    fun get(): Int = counter

    fun increment(): Int {
        counter++
        return counter
    }

    fun decrement(): Int {
        counter--
        return counter
    }
}