package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.fna.model.DayBookDetails;

public interface DayBookDetailsRepo extends JpaRepository<DayBookDetails, Integer> {

	@Query(value = "exec openclosedaybooksave @companyid=:companyid,@ledgerid=:ledgerid,@action=:action ", nativeQuery = true)
	DayBookDetails findClosingBalance(@Param("companyid") int companyid,@Param("ledgerid") int ledgerid,@Param("action") String action); 
	 
	@Query(value = "exec openclosedaybooksave @companyid=:companyid,@ledgerid=:ledgerid,@daybookdate=:daybookdate,@action=:action ", nativeQuery = true)
	DayBookDetails findOpeningBalance(@Param("companyid") int companyid,@Param("ledgerid") int ledgerid,@Param("daybookdate") String daybookdate,@Param("action") String action); 
	
	@Query(value = "exec openclosedaybooksave @companyid=:companyid,@daybookdate=:daybookdate,@ledgerid=:ledgerid,@action=:action ", nativeQuery = true)
	DayBookDetails findPreviousOpeningBalance(@Param("companyid") int companyid,@Param("daybookdate") String daybookdate,@Param("ledgerid") int ledgerid,@Param("action") String action); 

	@Transactional
	@Modifying
	@Query(value = "exec openclosedaybooksave @companyid=:companyid,@ledgerid=:ledgerid,@closingbalance=:closingbalance,@daybookdate=:daybookdate,@action=:action ", nativeQuery = true)
	int updateClosingBalance(@Param("companyid") int companyid,@Param("ledgerid") int ledgerid,@Param("closingbalance") Double closingbalance,@Param("daybookdate") String daybookdate,@Param("action") String action); 

	@Transactional
	@Modifying
	@Query(value = "exec openclosedaybooksave @companyid=:companyid,@ledgerid=:ledgerid,@daybookdate=:daybookdate,@closingbalance=:closingbalance,@action=:action ", nativeQuery = true)
	int updatePreviousClosingBalance(@Param("companyid") int companyid,@Param("daybookdate") String daybookdate,@Param("ledgerid") int ledgerid,@Param("closingbalance") Double closingbalance,@Param("action") String action); 
}
 