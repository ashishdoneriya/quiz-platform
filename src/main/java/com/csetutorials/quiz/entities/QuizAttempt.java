package com.csetutorials.quiz.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;

@Table("quizAttempts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizAttempt {

	@PrimaryKeyColumn(name = "userId", type = PrimaryKeyType.PARTITIONED)
	@CassandraType(type = CassandraType.Name.BIGINT)
	private Long userId;

	@PrimaryKeyColumn(name = "quizId", type = PrimaryKeyType.CLUSTERED)
	@CassandraType(type = CassandraType.Name.BIGINT)
	private Long quizId;

	@PrimaryKeyColumn(name = "attemptNumber", type = PrimaryKeyType.CLUSTERED)
	@CassandraType(type = CassandraType.Name.INT)
	private int attemptNumber;

	@Column("submittedAt")
	@CassandraType(type = CassandraType.Name.TIMESTAMP)
	private Date submittedAt;

	@Column("status")
	@CassandraType(type = CassandraType.Name.TEXT)
	private QuizResultStatus status;

	@Column("score")
	@CassandraType(type = CassandraType.Name.INT)
	private Integer score;

}
