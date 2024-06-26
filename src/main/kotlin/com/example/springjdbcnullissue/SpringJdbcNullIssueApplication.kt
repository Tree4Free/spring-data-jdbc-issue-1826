package com.example.springjdbcnullissue

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories

@SpringBootApplication
@EnableJdbcRepositories
class SpringJdbcNullIssueApplication

fun main(args: Array<String>) {
    runApplication<SpringJdbcNullIssueApplication>(*args)
}
