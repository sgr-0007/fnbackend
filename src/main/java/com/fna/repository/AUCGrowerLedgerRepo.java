package com.fna.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.AUCGrowerLedger;

public interface AUCGrowerLedgerRepo extends JpaRepository<AUCGrowerLedger, Integer>{

	@Modifying
	@Query(value="update auctb_master_grower set status=1 where mgid=:ledgerid",nativeQuery = true)
	int  updateByStatus(@Param("ledgerid") int ledgerid);
	
	List<AUCGrowerLedger> findBycompanyid(int companyid);
}
