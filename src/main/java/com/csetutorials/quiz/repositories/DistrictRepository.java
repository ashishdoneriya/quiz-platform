package com.csetutorials.quiz.repositories;

import com.csetutorials.quiz.entities.District;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends CassandraRepository<District, String>, CustomDistrictRepository {
}
