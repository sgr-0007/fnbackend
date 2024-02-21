package com.fna.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.AUCBuyerLedger;
import com.fna.model.AUCGrowerLedger;
import com.fna.model.AucInvoiceHeader;
import com.fna.service.AUCLedgerService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AUCLedgerDetails {


	@Autowired
	private AUCLedgerService service;
	
	@GetMapping("/aucbuyerledger/{cmpid}")
    public ResponseEntity<List<AUCBuyerLedger>> getBuyerLedger(@PathVariable("cmpid") Integer cmpid) {     
	return service.getAucBuyerLedger(cmpid);
    }
	
	@GetMapping("/aucgrowerledger/{cmpid}")
    public ResponseEntity<List<AUCGrowerLedger>> getGrowerLedger(@PathVariable("cmpid") Integer cmpid) {     
	return service.getAucGrowerLedger(cmpid);
    }
	
	@Transactional
	@PutMapping("/auction/approvebuyer")
	public ResponseEntity<Boolean> approveAuctionPlatform(@RequestBody AUCBuyerLedger buyer){
		return service.updateAucBuyer(buyer);
	}
	@Transactional
	@PutMapping("/auction/approvebuyerlist")
	public ResponseEntity<Boolean> approveAuctionPlatform(@RequestBody List<AUCBuyerLedger> buyer){
		return service.updateAucBuyerList(buyer);
	}
}
