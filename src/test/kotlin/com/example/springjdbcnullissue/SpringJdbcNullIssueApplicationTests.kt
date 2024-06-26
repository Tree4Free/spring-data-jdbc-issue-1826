package com.example.springjdbcnullissue

import com.example.springjdbcnullissue.domain.MyEntity
import com.example.springjdbcnullissue.testcontainers.EnableTestContainers
import com.example.springjdbcnullissue.persistence.MyEntityRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@EnableTestContainers
class SpringJdbcNullIssueApplicationTests {

    @Autowired
    lateinit var myEntityRepository: MyEntityRepository

    @Test
    fun testNullTextArray() {
        val entity = myEntityRepository.save(
            MyEntity(
                null,
                null,
                emptyList<String>()
            )
        )
        val entityLoaded = myEntityRepository.findById(entity.id)
        Assertions.assertNotNull(entityLoaded.get().tags)
    }
}
