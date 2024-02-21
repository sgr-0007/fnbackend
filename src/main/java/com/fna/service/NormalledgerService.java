package com.fna.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.Normalledger;
import com.fna.repository.NormalledgerRepository;

@Service
public class NormalledgerService {
	
	@Autowired
	private NormalledgerRepository normalledgerrepository;
	
	public ResponseEntity<Normalledger> saveNormalledger(Normalledger normalledger) {		
		try {
			normalledger.setAccounttype(null);
			normalledger.setCompanytypename(null);
			normalledgerrepository.save(normalledger);
			return new ResponseEntity<>(normalledger, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<Normalledger>> getNormalledger() {
		   try 
		   {
			List<Normalledger> normalledger = new ArrayList<Normalledger>();        
			normalledgerrepository.findAll().forEach(normalledger::add);
	        if(normalledger.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(normalledger,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public ResponseEntity<List<Normalledger>> getNormalledgernative() {
		   try 
		   {
			List<Normalledger> normalledger = new ArrayList<Normalledger>();        
			normalledgerrepository.Normalledgernative().forEach(normalledger::add);
	        if(normalledger.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(normalledger,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public ResponseEntity<Normalledger> getNormalledgerById(int normalledgerid) {
		Optional<Normalledger> normalledgeridData = normalledgerrepository.findById(normalledgerid);
		if (normalledgeridData.isPresent()) {
			return new ResponseEntity<>(normalledgeridData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	    }
	
	public ResponseEntity<Normalledger> updateNormalledger(int normalledgerid,Normalledger normalledger) {
		Optional<Normalledger> existingNormalledger = normalledgerrepository.findById(normalledgerid);
		if (existingNormalledger.isPresent()) {
			Normalledger _normalledger = existingNormalledger.get();
			_normalledger.setLedgername(normalledger.getLedgername());
			_normalledger.setLedgeralias(normalledger.getLedgeralias());
			_normalledger.setGroupid(normalledger.getGroupid());
			_normalledger.setGroupname(normalledger.getGroupname());
			_normalledger.setSubgroupid(normalledger.getSubgroupid());
			_normalledger.setSubgroupname(normalledger.getSubgroupname());
			_normalledger.setCompanyid(normalledger.getCompanyid());
			_normalledger.setCompanyname(normalledger.getCompanyname());
			_normalledger.setIsactive(normalledger.isIsactive());
			_normalledger.setCompanytype(normalledger.getCompanytype());
			_normalledger.setAccounttypeid(normalledger.getAccounttypeid());
			_normalledger.setCompanytypename(null);
			_normalledger.setAccounttype(null);
			return new ResponseEntity<>(normalledgerrepository.save(_normalledger), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	
    }
	
	public Boolean checkUnique(int id,String name) {
		   return normalledgerrepository.checkUnique("checkifuniquenormalledgername", id, name);
			}
	
	

}


