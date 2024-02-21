package com.fna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.AUCBuyerLedger;
import com.fna.model.AUCGrowerLedger;
import com.fna.model.AucInvoiceHeader;
import com.fna.repository.AUCBuyerLedgerRepo;
import com.fna.repository.AUCGrowerLedgerRepo;

@Service
public class AUCLedgerService {

	@Autowired
	private AUCBuyerLedgerRepo buyerRepo;
	@Autowired
	private AUCGrowerLedgerRepo growerRepo;
	
public ResponseEntity<List<AUCBuyerLedger>> getAucBuyerLedger(Integer cmpid){
		
		return ResponseEntity.ok(buyerRepo.findBycompanyid(cmpid));
	}
	
public ResponseEntity<List<AUCGrowerLedger>> getAucGrowerLedger(Integer cmpid){
		
		return ResponseEntity.ok(growerRepo.findBycompanyid(cmpid));
	}

public ResponseEntity<Boolean> updateAucBuyer(AUCBuyerLedger buyer) {
	// TODO Auto-generated method stub
	int s=buyerRepo.approveaucinvoice(buyer.getBid());
	System.out.println("update response"+s);
	if(s==1) {
	return ResponseEntity.ok(true);
	}
	else {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}
}

public ResponseEntity<Boolean> updateAucBuyerList(List<AUCBuyerLedger> buyer) {
	// TODO Auto-generated method stub
	for(AUCBuyerLedger hd: buyer) {
		int s=buyerRepo.approveaucinvoice(hd.getBid());
		System.out.println("update response"+s);
		}
		
		return ResponseEntity.ok(true);
}
	
}
