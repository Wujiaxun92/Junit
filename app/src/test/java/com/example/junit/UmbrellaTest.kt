package com.example.junit

import org.junit.Test
import org.junit.Assert

class UmbrellaTest {
    @Test
    fun totalPrice(){
        val umbrella = Umbrella()
        val stubWeather = StubWeather()
        stubWeather.fakeisSunny = true
        val actual = umbrella.totalPrice(5, 200, stubWeather)
        val expected = 900
        Assert.assertEquals(expected, actual)
    }
    @Test
    fun totalPrice_raining(){
        val umbrella = Umbrella()
        val stubWeather = StubWeather()
        stubWeather.fakeisSunny = false
        val actual = umbrella.totalPrice(5, 200, stubWeather)
        val expected = 900
        Assert.assertEquals(expected, actual)
    }
}