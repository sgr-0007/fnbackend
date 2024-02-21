package com.fna.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.Uom;
import com.fna.repository.UomRepository;

@Service
public class UomService {

	@Autowired
	private UomRepository uomrepository;
	
	public ResponseEntity<Uom> saveUom(Uom uom) {		
		try {
			uomrepository.save(uom);
			return new ResponseEntity<>(uom, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<Uom>> getUom() {
	   try 
	   {
		List<Uom> uom = new ArrayList<Uom>();        
		uomrepository.findAll().forEach(uom::add);
        if(uom.isEmpty())
        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
        }
        return new ResponseEntity<>(uom,HttpStatus.OK);
	   }
	   catch (Exception e) {
		   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
	
	public ResponseEntity<Uom> getUomById(int uomid) {
		Optional<Uom> uomData = uomrepository.findById(uomid);
		if (uomData.isPresent()) {
			return new ResponseEntity<>(uomData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	    }
	
	public ResponseEntity<Uom> updateUom(int uomid,Uom uom) {
		Optional<Uom> existingUom = uomrepository.findById(uomid);
		if (existingUom.isPresent()) {
			Uom _uom = existingUom.get();
			_uom.setUomname(uom.getUomname());
			_uom.setUomdescription(uom.getUomdescription());
			_uom.setIsactive(uom.isIsactive());		
			return new ResponseEntity<>(uomrepository.save(_uom), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	
    }
	
}
