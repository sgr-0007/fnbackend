package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.SaleNotePaymentFailure;

public interface SaleNotePaymentFailureRepo extends JpaRepository<SaleNotePaymentFailure, Integer> {

	
	@Query(value = "exec getpaymentfailureview  @companyid=:companyid,@fromdate=:fromdate", nativeQuery = true)
	List<SaleNotePaymentFailure> getpfView(@Param("companyid") int companyid,@Param("fromdate") String fromdate); 
}
