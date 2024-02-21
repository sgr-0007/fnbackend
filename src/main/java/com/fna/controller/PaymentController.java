package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.Payment;
import com.fna.service.PaymentService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	@GetMapping("/payment/view")
	public ResponseEntity<List<Payment>> getPaymentDetais(){
		return paymentService.getPayment();
	}
	@PatchMapping("/payment/{invoiceid}")
	public ResponseEntity<Payment> createPaymentDetais(@PathVariable("invoiceid") int invoiceId, @RequestBody Payment payment){
		
		return paymentService.createPayment(payment,invoiceId);
	}
	@PostMapping("/payment/{invoiceid}")
	public ResponseEntity<Payment> insertInvoiceDetais(@PathVariable("invoiceid") int invoiceId ){
		return paymentService.insertInvoiceDetails(invoiceId);
	}
	
	
	
}
