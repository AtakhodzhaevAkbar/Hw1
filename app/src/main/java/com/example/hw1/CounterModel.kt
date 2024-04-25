package com.example.hw1

class CounterModel {
    private var count = 0

    fun incrementCount() {
        count++
    }

    fun decrementCount() {
        if (count > 0)
            count--
    }

    fun getCount()=count
}