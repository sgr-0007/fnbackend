package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.fna.model.CompanyDetails;

public interface CompanyDetailsRepository extends JpaRepository<CompanyDetails, Integer> {

	@Query(value = "exec getCompanydetails", nativeQuery = true)
	List<CompanyDetails> findCompanies(); 
	
}
