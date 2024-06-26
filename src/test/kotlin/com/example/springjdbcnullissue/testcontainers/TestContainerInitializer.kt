package com.example.springjdbcnullissue.testcontainers

import org.springframework.boot.test.util.TestPropertyValues
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.ConfigurableApplicationContext

class TestContainerInitializer : ApplicationContextInitializer<ConfigurableApplicationContext> {
    companion object {
        @JvmStatic
        val postgres = TestContainers.postgres

        init {
            postgres.start()
        }
    }

    override fun initialize(applicationContext: ConfigurableApplicationContext) {
        val properties = buildMap<String, String> {
            put("spring.datasource.url", postgres::getJdbcUrl.invoke())
            put("spring.datasource.username", postgres::getUsername.invoke())
            put("spring.datasource.password", postgres::getPassword.invoke())
        }

        TestPropertyValues.of(properties).applyTo(applicationContext)
    }
}
