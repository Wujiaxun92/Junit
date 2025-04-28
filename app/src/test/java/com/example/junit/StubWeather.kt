package com.example.junit

import com.example.junit.umbrella.IWeather

class StubWeather: IWeather {
    var fakeisSunny = false
    override fun isSunny(): Boolean{
        return fakeisSunny
    }
}