package com.fna.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.PaymentType;
import com.fna.repository.PaymentTypeRepository;

@Service
public class PaymentTypeService {

	@Autowired
	private PaymentTypeRepository paymentRepo;
	public  ResponseEntity<List<PaymentType>> getPaymentType(){
		List<PaymentType> paymentType=new ArrayList<PaymentType>();
		paymentType=paymentRepo.findAll();
		return new ResponseEntity<>(paymentType,HttpStatus.OK);
	}
}
