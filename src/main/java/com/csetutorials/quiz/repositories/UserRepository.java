package com.csetutorials.quiz.repositories;

import com.csetutorials.quiz.entities.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<User, Long> {
}
