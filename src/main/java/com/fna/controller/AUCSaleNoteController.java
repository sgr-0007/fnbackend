package com.fna.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.AUCSalenoteDetails;
import com.fna.model.AucInvoiceHeader;
import com.fna.model.AucInvoiceHeaderDetails;
import com.fna.service.AUCSalenoteService;
import com.fna.service.AucInvoiceService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AUCSaleNoteController {
	
	@Autowired
	private AUCSalenoteService service;
	
	
	@GetMapping("/aucsalenote/{from}/{to}/{cmpid}")
	public ResponseEntity<List<AUCSalenoteDetails>> getAucInvoiceHeaderByDate(@PathVariable("from") Date from,@PathVariable("to") Date to,@PathVariable("cmpid") Integer cmpid) throws ParseException {     
		System.out.println("from"+from+"to"+to+"companyiod"+cmpid);
			return service.getAucInvoiceHeaderByDate(from,to,cmpid);
	    }
	
	@Transactional
	@PutMapping("/auction/pucapprovelist")
	public ResponseEntity<Boolean> approvePUCAuctionPlatform(@RequestBody List<AUCSalenoteDetails> header){
		System.out.println("Approve selected");
		return service.updateAucSalenoteHeaderList(header);
	}
}
