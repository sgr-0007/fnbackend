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

import com.fna.model.Group;  
import com.fna.model.Uom;
import com.fna.service.GroupService;
import com.fna.service.UomService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class UomController {

	@Autowired
	private UomService uomservice;
	
	@PostMapping("/uom")
    public ResponseEntity<Uom> addUom(@RequestBody Uom uom) {
        return uomservice.saveUom(uom); 
    } 
	
	@GetMapping("/uom")
    public ResponseEntity<List<Uom>> findAllGroups() {     
	return uomservice.getUom();
    }
	
	@GetMapping("/uom/{id}")
    public ResponseEntity<Uom> findGroupById(@PathVariable(value = "id") int uomid) {     
	return uomservice.getUomById(uomid);
    }

    @PutMapping("/uom/{id}")
   public ResponseEntity<Uom> updateUom(@PathVariable(value = "id") int uomid,
	         @RequestBody Uom uom) {    	
       return uomservice.updateUom(uomid,uom);
   }
}
