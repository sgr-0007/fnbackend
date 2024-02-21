package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.City;
import com.fna.model.CityDetails;
import com.fna.service.CityService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CityController {

	@Autowired
	private CityService cityService;
	
	@Transactional(readOnly = true)
	@GetMapping("/city")
	public ResponseEntity<List<CityDetails>> getAllCities() {
		return cityService.getCity();
	}
	@GetMapping("/cities")
    public ResponseEntity<List<City>> findcities() {     
	return cityService.getCities();
    }
	
	@GetMapping("/cities/{stateid}")
    public ResponseEntity<List<City>> findcities(@PathVariable int stateid) {     
	return cityService.getCitiesByStateId(stateid);
    }
	
}
