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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.Normalledger;
import com.fna.service.NormalledgerService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class NormalledgerController {
	
	@Autowired
	private NormalledgerService normalledgerservice;
	
	@PostMapping("/normalledger")
    public ResponseEntity<Normalledger> addNormalledger(@RequestBody Normalledger normalledger) {
        return normalledgerservice.saveNormalledger(normalledger); 
    }
	
	@GetMapping("/normalledger")
    public ResponseEntity<List<Normalledger>> findAllNormalledger() {     
	return normalledgerservice.getNormalledger();
    }
	
	@GetMapping("/normalledgertable")
    public ResponseEntity<List<Normalledger>> Normalledgernative() {     
	return normalledgerservice.getNormalledgernative();
    }
	
	@GetMapping("/normalledger/{id}")
    public ResponseEntity<Normalledger> findNormalledgerById(@PathVariable(value = "id") int normalledgerid) {     
	return normalledgerservice.getNormalledgerById(normalledgerid);
    }

    @PutMapping("/normalledger/{id}")
   public ResponseEntity<Normalledger> updateNormalledger(@PathVariable(value = "id") int normalledgerid,
	         @RequestBody Normalledger normalledger) {    	
       return normalledgerservice.updateNormalledger(normalledgerid,normalledger);
   }
    @GetMapping("/checknormalledgeruniqueonedit")
    public Boolean checkUnique(@RequestParam("id") int id ,
            @RequestParam("name") String name ) {     
	return normalledgerservice.checkUnique(id,name);

    }

}
