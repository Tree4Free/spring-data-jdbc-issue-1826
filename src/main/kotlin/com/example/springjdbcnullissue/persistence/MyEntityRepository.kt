package com.example.springjdbcnullissue.persistence

import com.example.springjdbcnullissue.domain.MyEntity
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface MyEntityRepository: org.springframework.data.repository.CrudRepository<MyEntity, UUID>
