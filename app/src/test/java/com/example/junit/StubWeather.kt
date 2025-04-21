package com.example.junit
class StubWeather:IWeather {
    var fakeisSunny = false
    override fun isSunny(): Boolean{
        return fakeisSunny
    }
}