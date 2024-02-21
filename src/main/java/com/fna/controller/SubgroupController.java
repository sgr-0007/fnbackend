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

import com.fna.model.Subgroup;
import com.fna.service.SubgroupService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class SubgroupController {
	
	@Autowired
	private SubgroupService subgroupservice;
	
	@PostMapping("/subgroup")
    public ResponseEntity<Subgroup> addSubgroup(@RequestBody Subgroup subgroup) {
        return subgroupservice.saveSubgroup(subgroup); 
    }
	
	@GetMapping("/subgroup")
    public ResponseEntity<List<Subgroup>> findAllSubgroup() {     
	return subgroupservice.getSubgroup();
    }
	@GetMapping("/subgrouptable")
    public ResponseEntity<List<Subgroup>> SubGroupnative() {     
	return subgroupservice.getSubgroupnative();
    }
	
	@GetMapping("/subgroup/{id}")
    public ResponseEntity<Subgroup> findSubgroupById(@PathVariable(value = "id") int subgroupid) {     
	return subgroupservice.getSubgroupById(subgroupid);
    }

	@PutMapping("/subgroup/{id}")
	   public ResponseEntity<Subgroup> updateProduct(@PathVariable(value = "id") int subgroupid,
		         @RequestBody Subgroup subgroup) {    	
	       return subgroupservice.updateSubgroup(subgroupid,subgroup);
	   }
    @GetMapping("/checksubgroupuniqueonedit")
    public Boolean checkUnique(@RequestParam("id") int id ,
            @RequestParam("name") String name ) {     
	return subgroupservice.checkUnique(id,name);

    }
}
