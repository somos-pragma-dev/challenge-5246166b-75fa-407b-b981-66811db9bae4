package com.example.infrastructure

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction
import org.jetbrains.exposed.sql.SchemaUtils

object DatabaseFactory {
    fun init() {
        Database.connect("jdbc:sqlite:test.db", driver = "org.sqlite.JDBC")
        transaction {
            SchemaUtils.create(Users)
        }
    }
}