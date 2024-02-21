package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.LedgerDetails;

public interface LedgerDetailsRepository extends JpaRepository<LedgerDetails, Integer>{

	@Query(value="exec getLedgerDetails @groupId=:catId",nativeQuery=true)
	List<LedgerDetails> getAllLedgerDetails(@Param("catId") int catId);
	
}
