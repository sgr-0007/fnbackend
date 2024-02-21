package com.fna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.ServiceCharge;
import com.fna.repository.ServiceChargeRepository;

@Service
public class ServiceRateService {

	@Autowired
	private ServiceChargeRepository serviceRepo;
	
	public ResponseEntity<List<ServiceCharge>> getServiceRate(){
		List<ServiceCharge> serviceList= serviceRepo.findAll();
		return new ResponseEntity<>(serviceList,HttpStatus.OK);
	}
}
