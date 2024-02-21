package com.fna.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.AUCGrowerLedger;
import com.fna.model.AucInvoiceHeader;
import com.fna.model.SalesLedger;
import com.fna.service.AUCBuyerService;
import com.fna.service.AUCGrowerService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AucGrowerController { 

	@Autowired
	private AUCGrowerService service;
	
	@Transactional
	@PostMapping("/aucgowerledger")
    public ResponseEntity<Boolean> getGrowerTransformed(@RequestBody List<AUCGrowerLedger> header) {     
	return service.getGrowerTransformed(header);
    }
	
	
	
	
	
}
