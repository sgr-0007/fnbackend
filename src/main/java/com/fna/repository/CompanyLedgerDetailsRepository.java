package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.CompanyLedgerDetails;


public interface CompanyLedgerDetailsRepository extends JpaRepository<CompanyLedgerDetails, Integer> {

	@Query(value = "exec openclosedaybooksave @companyid=:companyid,@action=:action ", nativeQuery = true)
	List<CompanyLedgerDetails> findLedgerID(@Param("companyid") int companyid,@Param("action") String action); 

	
	
}
