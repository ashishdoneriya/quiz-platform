package com.csetutorials.quiz.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("userEmailUserIdMapper")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEmailUserIdMapper {

	@PrimaryKeyColumn(name = "email", type = PrimaryKeyType.PARTITIONED)
	private String email;

	@Column
	private Long id;

}
