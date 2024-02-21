package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.OfficeBankMappingDetails;

public interface OfficeBankMappingRepo extends JpaRepository<OfficeBankMappingDetails, Integer> {

	List<OfficeBankMappingDetails> findByofficeid(int officeid);
}
