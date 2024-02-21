package com.fna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.CreditLimit;
import com.fna.repository.CreditLimitRepo;

@Service
public class CreditlimitService {

	@Autowired
	private CreditLimitRepo limitRepo;
	public ResponseEntity<CreditLimit> getCreditLimitById(int buyerId){
		
		CreditLimit limit=limitRepo.findBybuyerId(buyerId);
		return new ResponseEntity<>(limit,HttpStatus.OK);
	}
	
	public ResponseEntity<CreditLimit> updateLimit(CreditLimit credLimit){
		credLimit=limitRepo.save(credLimit);
		return new ResponseEntity<CreditLimit>(credLimit,HttpStatus.OK);
	}
	
}
