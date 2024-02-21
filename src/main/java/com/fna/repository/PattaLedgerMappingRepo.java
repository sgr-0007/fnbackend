package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.PattaLedgerByOffice;

public interface PattaLedgerMappingRepo extends JpaRepository<PattaLedgerByOffice, Integer>{

	List<PattaLedgerByOffice> findByofficeid(int i);

	
}
