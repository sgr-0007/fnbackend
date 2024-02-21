package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.OfficeMappingDetails;

public interface OfficeMappingRepo extends JpaRepository<OfficeMappingDetails, Integer> {

	
}
