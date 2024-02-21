package com.fna.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.AucLoanMaster;
import com.fna.model.SalesLedger;
import com.fna.model.SubLedger;
import com.fna.model.SubledgerForLoan;
import com.fna.repository.AUCLoanRepo;
import com.fna.repository.SubLedgerRepository;
import com.fna.repository.SubledgerForLoanRepo;

@Service
public class AucloanService {

	@Autowired
	private AUCLoanRepo repo;
	@Autowired
	private SubledgerForLoanRepo subledgrepository;

	public ResponseEntity<List<SubledgerForLoan>> transformData() {
		List<SubledgerForLoan> subledger= new ArrayList<SubledgerForLoan>();
		List<AucLoanMaster> aucloanmaster=new ArrayList<AucLoanMaster>();
		 aucloanmaster=repo.findAll();
		if(!aucloanmaster.isEmpty())
		{
			//transform to subledger
			//10718 apf loan
			//10866 APF Loan
			for(AucLoanMaster auc :aucloanmaster) {
				SubledgerForLoan ledger= new SubledgerForLoan();
			ledger.setLedgerid(10718);
			ledger.setSubledgername(auc.getLoanhead());
			ledger.setLoancode(auc.getLoancode());
			ledger.setAuctionoradmin(1);
			subledger.add(ledger);
			}
			subledgrepository.saveAll(subledger);
			return new ResponseEntity<List<SubledgerForLoan>>(subledger,HttpStatus.CREATED);
		}else
		return new ResponseEntity<List<SubledgerForLoan>>(subledger,HttpStatus.FAILED_DEPENDENCY);
	}

	public ResponseEntity<List<AucLoanMaster>> getLoanmaster() {
			
		return new ResponseEntity<List<AucLoanMaster>>(repo.findAll(),HttpStatus.FOUND);
	}
}
