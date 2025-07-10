package com.csetutorials.quiz.repositories;

import com.csetutorials.quiz.entities.District;

import java.util.List;

public interface CustomDistrictRepository {

	List<District> findAllDistricts();

	void saveDistrict(String districtName);

}
