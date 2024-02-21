package com.fna.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.VoucherPaymentHeader;


public interface VoucherPaymentHeaderRepo extends JpaRepository<VoucherPaymentHeader, Integer>  {

	Optional<VoucherPaymentHeader> findByvoucherid(Integer voucherid);
	
	 

}
