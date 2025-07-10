package com.csetutorials.quiz.repositories;

import com.csetutorials.quiz.entities.District;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomDistrictRepositoryImpl implements CustomDistrictRepository {

	private static final String cql = "SELECT * FROM districts WHERE country = 'IN'";

	@Autowired
	private CassandraTemplate cassandraTemplate;

	@Override
	public List<District> findAllDistricts() {
		return cassandraTemplate.select(cql, District.class);
	}

	@Override
	public void saveDistrict(String districtName) {
		cassandraTemplate.insert(new District("IN", districtName));
	}

}
