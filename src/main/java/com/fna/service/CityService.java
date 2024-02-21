package com.fna.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.City;
import com.fna.model.CityDetails;
import com.fna.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private com.fna.repository.cityrepo cityrepo;
	
	public ResponseEntity<List<CityDetails>> getCity(){
		List<CityDetails> lcityDetails=cityRepository.getCitiesList();
		return new ResponseEntity<>(lcityDetails, HttpStatus.OK);
	}
	public ResponseEntity<List<City>> getCities() {
		try {
			List<City> city = new ArrayList<City>();
			cityrepo.findAll().forEach(city::add);
			if (city.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(city, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<City>> getCitiesByStateId(int stateid) {
		try {
			List<City> city = new ArrayList<City>();
			cityrepo.findBystateid(stateid).forEach(city::add);
			if (city.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(city, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
