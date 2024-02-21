package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.Normalledger;
import com.fna.model.SubLedger;

public interface SubLedgerRepository extends JpaRepository<SubLedger, Integer> {

	
	public SubLedger findBysubledgerid(int subledgerid);  

}
