package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.AUCBuyerLedger;
import com.fna.model.AucInvoiceHeader;
import com.fna.model.SalesLedger;
import com.fna.service.AUCBuyerService;
import com.fna.service.AucInvoiceService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AUCTLedgerController {

	@Autowired
	private AUCBuyerService service;
	
	@GetMapping("/auctbuyerledger")
    public ResponseEntity<List<SalesLedger>> getBuyerTransformed() {     
	return service.getBuyerTransformed();
    }
	
	
	
}
