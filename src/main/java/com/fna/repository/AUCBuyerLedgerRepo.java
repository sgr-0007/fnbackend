package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.AUCBuyerLedger;

public interface AUCBuyerLedgerRepo extends JpaRepository<AUCBuyerLedger, Integer> {

	@Modifying
	@Query(value = " update auctb_master_buyer set cstatus=2 ,status=1 where bid=:bid", nativeQuery = true)
	int approveaucinvoice(@Param("bid") int bid);
	
	List<AUCBuyerLedger> findBycompanyid(int companyid);
	
	
}
