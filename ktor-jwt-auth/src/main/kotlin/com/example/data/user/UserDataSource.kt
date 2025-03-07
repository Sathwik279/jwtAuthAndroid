package com.example.data.user

interface UserDataSource {
    // when we log in later we need to find username and find whether the passwrod the user enteres matches with the passowrdo of the user that we get form the database
    suspend fun getUserByUsername(username: String): User?
    suspend fun insertUser(user: User): Boolean
}
// u should always rely on abstractions but not on direct implementation directly