package com.fna.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.CreditLimit;
import com.fna.service.CreditlimitService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class Creditlimitcontroller {

	@Autowired
	private CreditlimitService limitservice;
	@GetMapping("/creditlimit/{buyerid}")
	public ResponseEntity<CreditLimit> getCreditLimitByBuyerId(@PathVariable int buyerid) {
		return limitservice.getCreditLimitById(buyerid);
	}
	
	@PutMapping("/creditlimit/update")
	public ResponseEntity<CreditLimit> updateCreditlimit(@RequestBody CreditLimit credLimit){
		return limitservice.updateLimit(credLimit);
	}
}
