package com.fna.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.PaymentBankCover;

public interface PaymentBankCoverRepo extends JpaRepository<PaymentBankCover, Integer> {

	Optional<PaymentBankCover> findByvoucherdetailid(Integer voucherdetailid);
	
	 

}
