package com.example.data.user

import com.mongodb.kotlin.client.coroutine.MongoDatabase
import com.mongodb.kotlin.client.coroutine.MongoCollection
import com.mongodb.client.model.Filters
import kotlinx.coroutines.flow.firstOrNull

class MongoUserDataSource(
    db: MongoDatabase
) : UserDataSource {

    private val users: MongoCollection<User> = db.getCollection("user")

    override suspend fun getUserByUsername(username: String): User? {
        return users.find(Filters.eq("username", username)).firstOrNull()
    }

    override suspend fun insertUser(user: User): Boolean {
        return try {
            users.insertOne(user).wasAcknowledged()
        } catch (e: Exception) {
            false
        }
    }
}
