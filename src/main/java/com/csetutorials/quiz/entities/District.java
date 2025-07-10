package com.csetutorials.quiz.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("districts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class District {

	@PrimaryKeyColumn(name = "country", type = PrimaryKeyType.PARTITIONED)
	private String country;

	@PrimaryKeyColumn(name = "districtName", type = PrimaryKeyType.CLUSTERED, ordering = Ordering.ASCENDING)
	private String districtName;

}

