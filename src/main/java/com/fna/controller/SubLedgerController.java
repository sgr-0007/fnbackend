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
import com.fna.model.SubLedger;
import com.fna.model.SubLedgerView;
import com.fna.service.SubLedegerService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class SubLedgerController {

	@Autowired
	private SubLedegerService subledgservice;
	@PostMapping("/postsubledg")
    public ResponseEntity<SubLedger> addSubgroup(@RequestBody SubLedger subgroup) {
        return subledgservice.saveSubLedg(subgroup); 
    }
	
	@GetMapping("/getsubledg")
    public ResponseEntity<List<SubLedgerView>> findAllSubgroup() {     
	return subledgservice.getSubgroupnative();
    }
	
	@PutMapping("/subledg/{id}")
	   public ResponseEntity<SubLedger> updateSubLedg(@PathVariable(value = "id") int subgroupid,
		         @RequestBody SubLedger subgroup) {    	
	       return subledgservice.updateSubLedger(subgroupid,subgroup);
	   }
	
}
