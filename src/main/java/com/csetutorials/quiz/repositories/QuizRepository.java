package com.csetutorials.quiz.repositories;

import com.csetutorials.quiz.entities.Quiz;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface QuizRepository extends CassandraRepository<Quiz, Long> {
}
