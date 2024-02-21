package com.fna.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.Creditlimitsetting;
import com.fna.repository.CreditlimitsettingRepository;

@Service
public class CreditlimitsettingService {
	
	@Autowired
	private CreditlimitsettingRepository creditlimitsettingrepository; 
	
	public ResponseEntity<Creditlimitsetting> saveCreditlimitsetting(Creditlimitsetting creditlimitsetting) {		
		try {
			creditlimitsettingrepository.save(creditlimitsetting);
			return new ResponseEntity<>(creditlimitsetting, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<Creditlimitsetting>> getCreditlimitsetting() {
	   try 
	   {
		List<Creditlimitsetting> creditlimitsetting = new ArrayList<Creditlimitsetting>();        
		creditlimitsettingrepository.findAll().forEach(creditlimitsetting::add);
        
		if(creditlimitsetting.isEmpty())
        {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
        }
        return new ResponseEntity<>(creditlimitsetting,HttpStatus.OK);
	   }
	   catch (Exception e) {
		 
		   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
	public ResponseEntity<List<Creditlimitsetting>> getCreditlimitsettingnative() {
		   try 
		   {
			List<Creditlimitsetting> item = new ArrayList<Creditlimitsetting>();        
			creditlimitsettingrepository.Creditlimitsettingnative().forEach(item::add);
	        if(item.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(item,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
//	public ResponseEntity<List<Creditlimitsetting>> getCreditlimitsettingnative() {
//		   try 
//		   {
//			   List<Creditlimitsetting> creditlimitsetting = new ArrayList<Creditlimitsetting>();        
//			   creditlimitsettingrepository.Creditlimitsettingnative().forEach(creditlimitsetting::add);
//		        if(creditlimitsetting.isEmpty())
//		        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
//		        }
//		        return new ResponseEntity<>(creditlimitsetting,HttpStatus.OK);
//			   }
//			   catch (Exception e) {
//				   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//			}
//		    }
	
	public ResponseEntity<Creditlimitsetting> getCreditlimitsettingById(int creditlimitid) {
		Optional<Creditlimitsetting> creditlimitidData = creditlimitsettingrepository.findById(creditlimitid);
		if (creditlimitidData.isPresent()) {
			return new ResponseEntity<>(creditlimitidData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	    }
	
	public ResponseEntity<Creditlimitsetting> updateCreditlimitsetting(int creditlimitid,Creditlimitsetting creditlimitsetting) {
		Optional<Creditlimitsetting> existingCreditlimitsetting = creditlimitsettingrepository.findById(creditlimitid);
		if (existingCreditlimitsetting.isPresent()) {
			Creditlimitsetting _creditlimitsetting = existingCreditlimitsetting.get();
//			_creditlimitsetting.setBuyerid(creditlimitsetting.getBuyerid());
			_creditlimitsetting.setCreditlimitamount(creditlimitsetting.getCreditlimitamount());
			//_creditlimitsetting.setUomid(creditlimitsetting.getUomid());
			//_item.setUomname(item.getUomname());
			//_creditlimitsetting.setIsactive(creditlimitsetting.isIsactive());		
			return new ResponseEntity<>(creditlimitsettingrepository.save(_creditlimitsetting), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	
    }

}
