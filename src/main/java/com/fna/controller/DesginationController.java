package com.fna.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fna.model.Designation;

import com.fna.service.DesignationService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")

public class DesginationController {
	@Autowired
	private DesignationService designationService;
	
	@GetMapping("/designations")
    public ResponseEntity<List<Designation>> finddesginations() {     
	return designationService.getDesignations();
    }


}
