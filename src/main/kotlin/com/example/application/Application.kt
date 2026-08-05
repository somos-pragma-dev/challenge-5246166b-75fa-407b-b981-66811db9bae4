package com.example.application

import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import com.example.application.Routing

fun main() {
    embeddedServer(Netty, port = 8080) {
        Routing()
    }.start(wait = true)
}