package com.fna.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.AUCGrowerLedger;
import com.fna.model.SalesLedger;
import com.fna.repository.AUCGrowerLedgerRepo;
import com.fna.repository.LedgerRepository;

@Service
public class AUCGrowerService {

	@Autowired
	private AUCGrowerLedgerRepo ledger;
	@Autowired
	private LedgerRepository ledgerRepository;
	public ResponseEntity<Boolean> getGrowerTransformed(List<AUCGrowerLedger> ledgerls) {

		if (!ledgerls.isEmpty()) {
			List<AUCGrowerLedger> ledgerlist =new ArrayList<>();
			for (AUCGrowerLedger hd : ledgerls) {
				// check if ledgeris already approved or not
				if(checkLedger(hd)) {
				//approveledgerByid	
				Optional<AUCGrowerLedger> fLedger;
				fLedger=ledger.findById(hd.getMgid());
				if(fLedger.isPresent()) {
				// create a purchase ledger

					SalesLedger purchase=new SalesLedger(); 
					purchase.setLedgerCode(""+fLedger.get().getTbgrno());
					purchase.setLedgerName("AUC-"+fLedger.get().getTbgrno()+"-"+fLedger.get().getGrowerName());
					purchase.setLedgerAlias(fLedger.get().getGrowerName());
					purchase.setActive((byte)1);
					purchase.setCompanyId(fLedger.get().getCompanyid());
					purchase.setAssociateHomeBranch(3);				
					purchase.setRecordApprovalStatus(3);
					purchase.setAccounttypeid(8);
					purchase.setAffectInventory(0);
					purchase.setGroupId(22);
					purchase.setAccounttypeid(8);
					purchase.setSubGroupId(203);
					purchase.setUndergroups("purchase");
					SalesLedger s= ledgerRepository.save(purchase);
					if(s!= null) {
						System.out.println(fLedger.get().getMgid());
					ledger.updateByStatus(fLedger.get().getMgid());}
				}else {
					return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
				}
				}else {
					return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
				}
				
			}
			return new ResponseEntity<>(true,HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);

		} 

	}

	boolean checkLedger(AUCGrowerLedger cledger) {
		
		Optional<AUCGrowerLedger> cdledger;
		cdledger=ledger.findById(cledger.getMgid());
		if(cdledger.get().getStatus()!=(Integer)1 || cdledger.get().getStatus()!=null)
		return true;
		else
			return false;
	}
	
	
	

}
