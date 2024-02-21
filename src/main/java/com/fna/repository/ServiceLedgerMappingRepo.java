package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.PattaLedgerByOffice;
import com.fna.model.ServiceLedgerByOffice;

public interface ServiceLedgerMappingRepo extends JpaRepository<ServiceLedgerByOffice, Integer>{

	List<ServiceLedgerByOffice> findByofficeid(int i);

	
}
