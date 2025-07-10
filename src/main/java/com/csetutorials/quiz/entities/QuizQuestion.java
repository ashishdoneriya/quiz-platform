package com.csetutorials.quiz.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;

@Table("quizQuestions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizQuestion {

	@PrimaryKeyColumn(name = "quizId", type = PrimaryKeyType.PARTITIONED)
	@CassandraType(type = CassandraType.Name.BIGINT)
	private Long quizId;

	@PrimaryKeyColumn(name = "questionId", type = PrimaryKeyType.CLUSTERED, ordinal = 0)
	@CassandraType(type = CassandraType.Name.SMALLINT)
	private Long questionId;

	@CassandraType(type = CassandraType.Name.TEXT)
	private String question;

	@CassandraType(type = CassandraType.Name.LIST, typeArguments = CassandraType.Name.TEXT)
	private List<String> options;

	@CassandraType(type = CassandraType.Name.TINYINT)
	private int correctOptionIndex;

}
