package com.fna.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.VoucherPayment;

public interface VoucherPaymentRepo extends JpaRepository<VoucherPayment, Integer> {

	Optional<VoucherPayment> findByvoucherdetailid(Integer voucherdetailid);
 
	
}
