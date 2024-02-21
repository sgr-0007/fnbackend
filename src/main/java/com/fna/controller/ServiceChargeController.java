package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.ServiceCharge;
import com.fna.service.ServiceRateService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ServiceChargeController {

	@Autowired
	private ServiceRateService service;
	@GetMapping("/servicecharge")
	public ResponseEntity<List<ServiceCharge>> getServiceRate(){
		return service.getServiceRate();
	}
}
