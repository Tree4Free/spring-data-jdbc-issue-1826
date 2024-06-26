package com.example.springjdbcnullissue.testcontainers

import org.testcontainers.containers.PostgreSQLContainer

object TestContainers {
    val postgres get() = PostgreSQLContainer("postgres:16-alpine")
}
