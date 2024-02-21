package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.PaymentType;
import com.fna.service.PaymentTypeService;
@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class PaymentTypeController {

	@Autowired
	private PaymentTypeService paymentTypeService;
	@GetMapping("/payment/type")
	public ResponseEntity<List<PaymentType>> getPaymentType(){
		return paymentTypeService.getPaymentType();
	}
}
