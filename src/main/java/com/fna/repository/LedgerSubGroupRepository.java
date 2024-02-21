package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.LedgerSubGroupDetails;

public interface LedgerSubGroupRepository extends JpaRepository<LedgerSubGroupDetails, Integer> {

	@Query(value = "exec getledgergroup @action=:action,@groupid=:groupid", nativeQuery = true)
	List<LedgerSubGroupDetails> getLedgerSubGroup(@Param("action") String action,@Param("groupid") int groupid); 

} 
