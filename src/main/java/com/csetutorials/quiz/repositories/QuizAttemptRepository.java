package com.csetutorials.quiz.repositories;

import com.csetutorials.quiz.entities.QuizAttempt;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface QuizAttemptRepository extends CassandraRepository<QuizAttempt, Long> {
}
