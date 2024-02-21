package com.fna.controller;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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

import com.fna.model.AucInvoiceDetails;
import com.fna.model.AucInvoiceHeader;
import com.fna.model.AucInvoiceHeaderDetails;
import com.fna.service.AucInvoiceService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AucInvoiceController {

	@Autowired
	private AucInvoiceService service;
	
	@GetMapping("/aucinvoiceheader")
    public ResponseEntity<List<AucInvoiceHeaderDetails>> getAuctionHeader() {     
	return service.getAucInvoiceHeader();
    }
	
	@GetMapping("/aucinvoiceheader/{from}/{to}/{cmpid}")
    public ResponseEntity<List<AucInvoiceHeaderDetails>> getAuctionHeaderDateWise(@PathVariable("from") Date from,@PathVariable("to") Date to,@PathVariable("cmpid") Integer cmpid) {     
	System.out.println("from"+from+"to"+to+"Companyid"+cmpid);
		return service.getAucInvoiceHeaderByDate(from,to,cmpid);
    }
	
	@GetMapping("/aucinvoicedetails")
    public ResponseEntity<List<AucInvoiceDetails>> getAuctionDetails() {     
	return service.getAucInvoiceDetails();
    }
	@Transactional
	@PutMapping("/auction/approve")
	public ResponseEntity<Boolean> approveAuctionPlatform(@RequestBody AucInvoiceHeader header){
		return service.updateAucInvoiceHeader(header);
	}
	
	@Transactional
	@PutMapping("/auction/approvelist")
	public ResponseEntity<Boolean> approveAuctionPlatform(@RequestBody List<AucInvoiceHeader> header){
		return service.updateAucInvoiceHeaderList(header);
	}
//	
//	@Transactional
//	@PutMapping("/auction/approvepay")
//	public ResponseEntity<Boolean> approvePayAuctionPlatform(@RequestBody AucInvoiceHeader header){
//		return service.updateAucInvoiceHeader(header);
//	}
//	
//	
//	@Transactional
//	@PutMapping("/auction/approvepaylist")
//	public ResponseEntity<Boolean> approvePayAuctionPlatform(@RequestBody List<AucInvoiceHeader> header){
//		return service.updateAucInvoiceHeaderList(header);
//	}
}
