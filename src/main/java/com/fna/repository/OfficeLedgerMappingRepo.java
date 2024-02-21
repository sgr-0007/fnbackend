package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.Ledgermapping;

public interface OfficeLedgerMappingRepo extends JpaRepository<Ledgermapping, Integer>{

	 Ledgermapping getByOfficeid(int officeid); 
}
