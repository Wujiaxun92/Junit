package com.example.junit

import org.junit.Test
import org.junit.Assert

class UmbrellaTest {
    @Test
    fun totalPrice(){
        val umbrella = Umbrella()
        val actual = umbrella.totalPrice(5, 200)
        val expected = 900
        Assert.assertEquals(expected, actual)
    }
}