package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fna.model.VoucherType;
import com.fna.service.VoucherTypeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class VoucherTypeController {

	@Autowired
	private VoucherTypeService vouchertypeService; 
	

	@GetMapping("/vouchertypes")
    public ResponseEntity<List<VoucherType>> findAllVouchertypes() {     
	return vouchertypeService.getAllVoucherTypes();
    }

	@GetMapping("/vouchertypes/{id}")
    public ResponseEntity<List<VoucherType>> findVouchertypes(@PathVariable(value = "id") int vouchertypeid) {     
	return vouchertypeService.getVoucherTypes(vouchertypeid);
    }
	
}
