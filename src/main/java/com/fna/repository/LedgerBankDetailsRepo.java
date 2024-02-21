package com.fna.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.LedgerBankDetails;

public interface LedgerBankDetailsRepo extends JpaRepository<LedgerBankDetails, Integer>{
	
	Optional<List<LedgerBankDetails>> findByLedgerid(int ledgerId);
}
