package com.example.junit

import com.example.junit.user.User
import com.example.junit.user.UserRespository
import com.example.junit.user.UserService
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class UserRepositoryMockkTest{
    private val userService = mockk<UserService>()
    private val repository = UserRespository(userService)

    @Test
    fun `測試返回第一個用戶資訊`() = runBlocking {
        val users = listOf(User(1, "Matthew", "w81221014177@gmail.com"))
        coEvery { userService.getUsers() }returns users
        val result = repository.fetchFirstUserName()
        Assert.assertEquals("First user:Matthew", result)
    }
    @Test
    fun `用戶不存在`() = runBlocking {
        coEvery { userService.getUsers() }returns emptyList()
        val result = repository.fetchFirstUserName()
        Assert.assertEquals("NO users found", result)
    }
    @Test
    fun `模擬網路錯誤`() = runBlocking {
        coEvery { userService.getUsers() } throws Exception("Network error")
        val result = repository.fetchFirstUserName()
        Assert.assertEquals("Error: Network error", result)
    }
}