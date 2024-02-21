package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.LedgerGroupDetails;

public interface LedgerGroupRepository extends JpaRepository<LedgerGroupDetails, Integer> {

	@Query(value = "exec getledgergroup @action=:action", nativeQuery = true)
	List<LedgerGroupDetails> getLedgerGroup(@Param("action") String action); 
	
	
		
}
