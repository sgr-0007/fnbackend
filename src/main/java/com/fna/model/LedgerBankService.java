package com.fna.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.repository.LedgerBankDetailsRepo;

@Service
public class LedgerBankService {

	@Autowired
	private  LedgerBankDetailsRepo bankRepo ;
	
	public ResponseEntity<List<LedgerBankDetails>> getbankDetailsByLedgerId(int ledgerid){
		Optional<List<LedgerBankDetails>> bankdetails = bankRepo.findByLedgerid(ledgerid);
		if(bankdetails.isPresent()) {
			return new ResponseEntity(bankdetails.get(),HttpStatus.OK) ;
		}else {
			return new ResponseEntity(null,HttpStatus.OK);
		}
		
		
	}

	public void deleteAllLedgerDetails(List<LedgerBankDetails> ledgerdetails) {
		System.out.println("bank to be deleted");
		 bankRepo.deleteAllInBatch(ledgerdetails);
		
	}
}
