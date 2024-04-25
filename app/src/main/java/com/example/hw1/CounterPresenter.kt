package com.example.hw1

class CounterPresenter (
    private val model:CounterModel,
    private val view:CounterView
){
    fun incrementClick(){
        model.incrementCount()
        view.updateCount(model.getCount())
    }

    fun decrementClick(){
        model.decrementCount()
        view.updateCount(model.getCount())
    }
}