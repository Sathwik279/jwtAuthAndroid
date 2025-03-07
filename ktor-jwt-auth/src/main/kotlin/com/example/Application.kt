package com.example

import com.example.data.user.MongoUserDataSource
import com.example.data.user.User
import com.example.plugins.configureMonitoring
import com.example.plugins.configureRouting
import com.example.plugins.configureSecurity
import com.example.plugins.configureSerialization
import com.example.security.hashing.SHA256HashingService
import com.example.security.token.JwtTokenService
import com.example.security.token.TokenConfig
import com.mongodb.kotlin.client.coroutine.MongoClient
import io.ktor.server.application.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val dbName = "ktor-auth"
    val userName = "sathwik-auth"
    val mongoPw = System.getenv("MONGO_PW")
    val connectionString = "mongodb+srv://$userName:$mongoPw@cluster0.dv2pivv.mongodb.net/$dbName?retryWrites=true&w=majority&appName=Cluster0"

    val mongoClient = MongoClient.create(connectionString)
    val database = mongoClient.getDatabase(dbName)

    val userDataSource = MongoUserDataSource(database)

//    GlobalScope.launch {
//        val user = User(
//            username = "test",
//            password = "testPassword",
//            salt = "salt"
//        )
//        userDataSource.insertUser(user)
//    }

    val tokenService = JwtTokenService()
    val tokenConfig = TokenConfig(
        issuer = environment.config.property("jwt.issuer").getString(),
        audience = environment.config.property("jwt.audience").getString(),
        expiresIn = 365L*1000L*60L*60L*24L,
        secret = System.getenv("JWT_SECRET")
    )
    val hashingService = SHA256HashingService()

    configureMonitoring()
    configureSerialization()
    configureSecurity(tokenConfig)
    configureRouting(userDataSource,hashingService,tokenService,tokenConfig)
}
