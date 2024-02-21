package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.LedgerBankDetails;
import com.fna.model.LedgerBankService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class LedgerBankController {

	@Autowired
	private LedgerBankService bankservice;
	
	@GetMapping("/bank/ledger/{ledgerid}")
	public ResponseEntity<List<LedgerBankDetails>> getBankDetailsByLedgerId(@PathVariable int ledgerid){
		return bankservice.getbankDetailsByLedgerId(ledgerid);
	}
	@DeleteMapping("/bank/delete")
	public void deletebankDetails(@RequestBody List<LedgerBankDetails> ledgerdetails ){
		 bankservice.deleteAllLedgerDetails(ledgerdetails);
	}
	
}
