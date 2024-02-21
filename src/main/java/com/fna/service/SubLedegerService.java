package com.fna.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.fna.model.SubLedger;
import com.fna.model.SubLedgerView;
import com.fna.repository.SubLedgerRepository;
import com.fna.repository.SubLedgerViewRepository;

@Service
public class SubLedegerService {
	@Autowired
	private SubLedgerRepository subledgrepository;
	@Autowired
	private SubLedgerViewRepository subledgviewrepository;
	
	public ResponseEntity<SubLedger> saveSubLedg(SubLedger subledg) {		
		try {
			subledgrepository.save(subledg);
			return new ResponseEntity<>(subledg, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<SubLedgerView>> getSubgroupnative() {
		   try 
		   {
			List<SubLedgerView> subledg = new ArrayList<SubLedgerView>();        
			subledgviewrepository.SubLedgerNative().forEach(subledg::add);
	        if(subledg.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(subledg,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public ResponseEntity<SubLedger> updateSubLedger(int subgroupid,SubLedger subgroup) {
		Optional<SubLedger> existingSubgroup = subledgrepository.findById(subgroupid);
		if (existingSubgroup.isPresent()) {
			SubLedger _subgroup = existingSubgroup.get();
			_subgroup.setLedgerid(subgroup.getLedgerid());
			_subgroup.setSubledgername(subgroup.getSubledgername());	
			return new ResponseEntity<>(subledgrepository.save(_subgroup), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	
    }
	
}
