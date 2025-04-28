package com.example.junit.user

class UserRespository(private val api: UserService) {
    fun fetchFirstUserName(): String {
        return try {
            val users = api.getUsers()
            if (users.isEmpty()){
                "No users found"
            }else{
                "first users: ${users[0].name}"
            }
        }catch (e: Exception){
            "Error: ${e.message}"
        }
    }
}