package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.SalenoteReconcile;
public interface SalenoteReconcileRepo extends JpaRepository<SalenoteReconcile, Integer>{

	
	@Query(value = "exec getpaymentview @companyid=:companyid,@fromdate=:fromdate", nativeQuery = true)
	List<SalenoteReconcile> SalenoteReconView(@Param("companyid") int companyid,@Param("fromdate") String fromdate); 
}
