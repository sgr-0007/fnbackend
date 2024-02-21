package com.fna.service;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.fna.model.Designation;

import com.fna.repository.DesignationRepository; 
@Service
public class DesignationService {
	@Autowired
	private DesignationRepository designationrepository;
	public ResponseEntity<List<Designation>> getDesignations() {
		try {
			List<Designation> designation = new ArrayList<Designation>();
			designationrepository.findAll().forEach(designation::add);
			if (designation.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(designation, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
