package com.example.springjdbcnullissue

import com.example.springjdbcnullissue.domain.MyEntity
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration
import org.springframework.data.relational.core.mapping.event.BeforeConvertCallback
import java.util.*

@Configuration
class IdConfiguration : AbstractJdbcConfiguration() {
    @Bean
    fun beforeSaveCallback(): BeforeConvertCallback<MyEntity> = BeforeConvertCallback<MyEntity> { entity ->
        entity.apply {
            if (id == null)
                id = UUID.randomUUID()
        }
    }
}
