package com.example.domain

import org.jetbrains.exposed.dao.id.IntIdTable

object Users : IntIdTable() {
    val name = varchar("name", 50)
    val email = varchar("email", 50).uniqueIndex()
    val password = varchar("password", 64)
}