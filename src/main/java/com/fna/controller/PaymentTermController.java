package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.PaymentTerm;
import com.fna.service.PaymentTermService;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class PaymentTermController {

	@Autowired
	private PaymentTermService paymentTermSerice;
	@GetMapping("/payment")
	public ResponseEntity<List<PaymentTerm>> getPaymentDetails() {
		return paymentTermSerice.getPaymentTerms();
	}
}
