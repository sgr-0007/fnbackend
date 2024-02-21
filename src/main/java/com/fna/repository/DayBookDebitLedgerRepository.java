package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.DayBookDebitLedger;

public interface DayBookDebitLedgerRepository extends JpaRepository<DayBookDebitLedger, Integer>{

	 
	@Query(value = "exec openclosedaybooksave @companyid=:companyid,@ledgerid=:ledgerid,@daybookdate=:daybookdate,@action=:action ", nativeQuery = true)
	DayBookDebitLedger finddebitsum(@Param("companyid") int companyid,@Param("ledgerid") int ledgerid,@Param("daybookdate") String daybookdate,@Param("action") String action);  
	
	@Query(value = "exec openclosedaybooksave @companyid=:companyid,@ledgerid=:ledgerid,@daybookdate=:daybookdate,@action=:action ", nativeQuery = true)
	DayBookDebitLedger findpreviousdebitsum(@Param("companyid") int companyid,@Param("ledgerid") int ledgerid,@Param("daybookdate") String daybookdate,@Param("action") String action); 
	 
}
