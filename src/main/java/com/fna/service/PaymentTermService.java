package com.fna.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.PaymentTerm;
import com.fna.repository.PaymentTermRepository;

@Service
public class PaymentTermService {

	@Autowired
	private PaymentTermRepository paymentTermsRepo;
	public ResponseEntity<List<PaymentTerm>> getPaymentTerms() {
		try {
			List<PaymentTerm> paymentTerms = new ArrayList<PaymentTerm>();
			paymentTermsRepo.findAll().forEach(paymentTerms::add);
			if (paymentTerms.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(paymentTerms, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
