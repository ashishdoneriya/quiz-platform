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
import java.util.List;

@Table("quizzes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {

	@PrimaryKeyColumn(name = "quizId", type = PrimaryKeyType.PARTITIONED)
	@CassandraType(type = CassandraType.Name.BIGINT)
	private Long quizId;

	@Column
	@CassandraType(type = CassandraType.Name.TEXT)
	private String quizName;

	@Column("startDateTime")
	@CassandraType(type = CassandraType.Name.TIMESTAMP)
	private Date startDateTime;

	@Column("endDateTime")
	@CassandraType(type = CassandraType.Name.TIMESTAMP)
	private Date endDateTime;

	@Column("materialUrls")
	@CassandraType(type = CassandraType.Name.LIST, typeArguments = CassandraType.Name.TEXT)
	private List<String> materialUrls;

	@Column("parentQuizzes")
	@CassandraType(type = CassandraType.Name.LIST, typeArguments = CassandraType.Name.BIGINT)
	private List<Long> parentQuizzes;

	@Column("maxRetries")
	@CassandraType(type = CassandraType.Name.INT)
	private int maxAttempts;

	@Column("reattemptDelayedMinutes")
	@CassandraType(type = CassandraType.Name.INT)
	private int reattemptDelayedMinutes;

	@Column("maxQuestions")
	private int maxQuestions;

}
