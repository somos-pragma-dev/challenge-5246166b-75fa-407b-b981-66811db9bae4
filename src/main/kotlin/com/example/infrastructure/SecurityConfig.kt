package com.example.infrastructure

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*
import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm

object SecurityConfig {
    fun Application.configureSecurity() {
        install(Authentication) {
            jwt("auth-jwt") {
                realm = "ktor-app"
                verifier(JWT
                   .require(Algorithm.HMAC256("secret"))
                   .withAudience("ktor-app")
                   .build())
                validate { credential ->
                    if (credential.payload.getClaim("email").asString().isNullOrEmpty())
                        null
                    else
                        JWTPrincipal(credential.payload)
                }
            }
        }
    }
}