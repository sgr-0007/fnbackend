package com.fna.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.DayBookCreditLedger;
public interface DayBookCreditLedgerRepository extends JpaRepository<DayBookCreditLedger, Integer> {

	@Query(value = "exec openclosedaybooksave @companyid=:companyid,@ledgerid=:ledgerid,@daybookdate=:daybookdate,@action=:action ", nativeQuery = true)
	DayBookCreditLedger findcreditsum(@Param("companyid") int companyid,@Param("ledgerid") int ledgerid,@Param("daybookdate") String daybookdate,@Param("action") String action); 

	@Query(value = "exec openclosedaybooksave @companyid=:companyid,@ledgerid=:ledgerid,@daybookdate=:daybookdate,@action=:action ", nativeQuery = true)
	DayBookCreditLedger findpreviouscreditsum(@Param("companyid") int companyid,@Param("ledgerid") int ledgerid,@Param("daybookdate") String daybookdate,@Param("action") String action); 

}
