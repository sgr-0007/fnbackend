package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.AUCBuyerLedger;
import com.fna.model.AucLoanMaster;
import com.fna.model.SalesLedger;
import com.fna.model.SubledgerForLoan;
import com.fna.service.AucloanService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AucLoanController {

	@Autowired
	private AucloanService service;
	@GetMapping("/transformaucloanmaster")
    public ResponseEntity<List<SubledgerForLoan>> TransformLoanmaster() {     
	return service.transformData();
	}
	
	@GetMapping("/auctrnloanmaster")
    public ResponseEntity<List<AucLoanMaster>> getLoanmaster() {     
	return service.getLoanmaster();
	}
}
