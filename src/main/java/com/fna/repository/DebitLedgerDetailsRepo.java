package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fna.model.DebitLedgerDetails;

public interface DebitLedgerDetailsRepo extends  JpaRepository<DebitLedgerDetails, Integer> {
	
	
	@Query(value="exec getDebitLedgerForVoucher",nativeQuery=true)
	List<DebitLedgerDetails> getDrLedgers(); 


}
