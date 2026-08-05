package com.example.application

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import com.example.domain.User
import com.example.infrastructure.DatabaseFactory
import com.example.infrastructure.SecurityConfig

fun Application.Routing() {
    install(SecurityConfig)
    routing {
        get("/ping") {
            call.respondText("pong")
        }
    }
}