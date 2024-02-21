package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.fna.model.CityDetails;

public interface CityRepository extends JpaRepository<CityDetails, Integer> {

	@Procedure("getAllCities")
	List<CityDetails>  getCitiesList();
}
