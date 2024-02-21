package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.FinancialYearDetails;
import com.fna.model.InvoiceDetails;
import com.fna.model.InvoiceInfo;
import com.fna.model.InvoiceItemDetails;
import com.fna.service.InvoiceService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceService;
	
	@GetMapping("/invoicenumber/{id}")
	public ResponseEntity<InvoiceDetails> saveInvoiceNumber(@PathVariable("id") int office){
		return invoiceService.insertInvoiceNumber(office);
	}
	@PostMapping("/invoice")
	public ResponseEntity<InvoiceDetails> saveInvoice(@RequestBody InvoiceDetails invoiceDetails){
		System.out.println(invoiceDetails);
		return invoiceService.insertInvoice(invoiceDetails);
	}
	@PostMapping("/invoice/items/{invoiceid}")
	public ResponseEntity<List<InvoiceItemDetails>> saveInvoiceItem(@PathVariable(name="invoiceid") int invoiceId, @RequestBody List<InvoiceItemDetails> invoiceDetails){
		
		return invoiceService.insertInvoiceItem(invoiceDetails,invoiceId);
	}
	
	@PatchMapping("/invoice/approve/{invoiceid}/{approververifiedstatus}/{roleid}")
	public ResponseEntity<InvoiceDetails> updateInvoiceApproveStatus(@PathVariable(name="invoiceid") int invoiceId,@PathVariable(name="approververifiedstatus") int approververifiedstatus ,@PathVariable(name="roleid") int roeId){
		
		return invoiceService.UpdateApproveStatus(invoiceId,approververifiedstatus,roeId);
	} 
	
	@GetMapping("/invoice/period")
	public ResponseEntity<FinancialYearDetails> getCurrentInvoicePeriod(){
	
		return invoiceService.getInvoicePeriod();
	}
	
	@GetMapping("/invoice")
	public ResponseEntity<List<InvoiceInfo>> getInvoicePeriod(){
	
		return invoiceService.getInvoice();
	}
	@GetMapping("/invoicedetails/{invoiceid}")
	public ResponseEntity<List<InvoiceItemDetails>> getInvoiceDetails(@PathVariable("invoiceid") int invoiceId){
				
		return invoiceService.getInvoiceDetailsById(invoiceId);
	}
	@GetMapping("/invoice/{id}")
	public ResponseEntity<InvoiceDetails> getInvoiceById(@PathVariable("id") int invoiceid){
	
		return invoiceService.getInvoiceById(invoiceid);
	}
}
