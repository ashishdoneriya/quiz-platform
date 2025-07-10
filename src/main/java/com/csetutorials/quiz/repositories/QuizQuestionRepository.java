package com.csetutorials.quiz.repositories;

import com.csetutorials.quiz.entities.QuizQuestion;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface QuizQuestionRepository extends CassandraRepository<QuizQuestion, Long> {
}
