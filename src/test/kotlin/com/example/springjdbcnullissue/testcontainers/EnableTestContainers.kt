package com.example.springjdbcnullissue.testcontainers

import org.springframework.test.context.ContextConfiguration

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@ContextConfiguration(initializers = [TestContainerInitializer::class])
annotation class EnableTestContainers
