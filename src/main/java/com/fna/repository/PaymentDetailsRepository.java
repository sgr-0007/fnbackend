package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.PaymentDetails;

public interface  PaymentDetailsRepository extends JpaRepository<PaymentDetails, Integer>{

	
}
