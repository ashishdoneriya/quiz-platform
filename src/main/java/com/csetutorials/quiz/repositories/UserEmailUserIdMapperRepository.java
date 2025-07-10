package com.csetutorials.quiz.repositories;

import com.csetutorials.quiz.entities.UserEmailUserIdMapper;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserEmailUserIdMapperRepository extends CassandraRepository<UserEmailUserIdMapper, Long> {
}
