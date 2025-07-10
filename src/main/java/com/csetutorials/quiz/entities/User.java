package com.csetutorials.quiz.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@PrimaryKeyColumn(name = "userId", type = PrimaryKeyType.PARTITIONED)
	private Long userId;

	@Column("userType")
	@CassandraType(type = CassandraType.Name.TEXT)
	private UserType userType;

	@Column
	private String email;

	@Column
	private String mobile;

	@Column
	private String name;

	@Column
	private String district;

}
