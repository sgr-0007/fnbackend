package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.TrailBalanceLedgerDetails;

public interface TrailBalanceLedgerDetailsRepository extends JpaRepository<TrailBalanceLedgerDetails, Integer> {

	@Query(value = "exec trailbalance @action=:action,@fromdate=:fromdate,@todate=:todate ", nativeQuery = true)
	List<TrailBalanceLedgerDetails> trailBalanceLedger(@Param("action") String action,@Param("fromdate") String fromdate,@Param("todate") String todate ); 

	

}
