package com.example.junit

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class SampleTest {
    @Before
    fun setup(){
        println("before")
    }
    @Test
    fun test1(){
        println("test1")
    }

    @After
    fun after(){
        println("after")
    }

    @Test
    fun test2(){
        println("test2")
    }

    companion object{
        @JvmStatic
        @BeforeClass
        fun beforeClass(){
            println("beforeClass")
        }

        @JvmStatic
        @AfterClass
        fun afterClass(){
            println("afterClass")
        }
    }
}