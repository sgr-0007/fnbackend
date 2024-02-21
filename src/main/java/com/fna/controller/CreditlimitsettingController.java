package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.Creditlimitsetting;

import com.fna.service.CreditlimitsettingService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CreditlimitsettingController {
	
	@Autowired
	private CreditlimitsettingService creditlimitsettingservice;
	
	@PostMapping("/creditlimitsetting")
    public ResponseEntity<Creditlimitsetting> addCreditlimitsetting(@RequestBody Creditlimitsetting creditlimitsetting) {
        return creditlimitsettingservice.saveCreditlimitsetting(creditlimitsetting); 
    } 
	
//	@GetMapping("/creditlimitsetting")
//    public ResponseEntity<List<Creditlimitsetting>> findAllCreditlimitsetting() {  
//	return creditlimitsettingservice.getCreditlimitsetting();
//    }
	
	@GetMapping("/creditlimitsettingtable")
    public ResponseEntity<List<Creditlimitsetting>> Creditlimitsettingnative() {     
	return creditlimitsettingservice.getCreditlimitsettingnative();
    }
	
//	@GetMapping("/creditlimitsettingtable")
//    public ResponseEntity<List<Creditlimitsetting>> Creditlimitsettingnative() {     
//	return creditlimitsettingservice.getCreditlimitsettingnative();
//    }
	
	@GetMapping("/creditlimitsetting/{id}")
    public ResponseEntity<Creditlimitsetting> findCreditlimitsettingById(@PathVariable(value = "id") int creditlimitid) {     
	return creditlimitsettingservice.getCreditlimitsettingById(creditlimitid);
    }
	
    @PutMapping("/creditlimitsetting/{id}")
    public ResponseEntity<Creditlimitsetting> updateCreditlimitsetting(@PathVariable(value = "id") int creditlimitid,
	         @RequestBody Creditlimitsetting creditlimitsetting) {    	
       return creditlimitsettingservice.updateCreditlimitsetting(creditlimitid,creditlimitsetting);
   }

}
