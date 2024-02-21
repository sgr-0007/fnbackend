package com.fna.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.fna.model.YearlyBudgetDetails;

public interface YearlyBudgetDetailsRepository extends JpaRepository<YearlyBudgetDetails, Integer> {

	@Query(value = "exec yearlybudget @companyid=:companyid,@ledgerid=:ledgerid,@action=:action ", nativeQuery = true)
	Double yearlyBalanceBudgetAmount(@Param("companyid") int companyid,@Param("ledgerid") int ledgerid,@Param("action") String action); 
	
	@Transactional
	@Modifying
	@Query(value = "exec yearlybudget @action=:action,@ledgerid=:ledgerid,@companyid=:companyid,@financialyear=:financialyear,@neww=:neww", nativeQuery = true)
	int updateSanctionedBalance(@Param("action") String action,@Param("ledgerid") int ledgerid,@Param("companyid") int companyid,@Param("financialyear") String financialyear,@Param("neww") Double neww);
	
	@Query(value = "exec yearlybudget @action=:action,@ledgerid=:ledgerid,@companyid=:companyid,@financialyear=:financialyear", nativeQuery = true)
	int checkYbdUpdate(@Param("action") String action,@Param("ledgerid") int ledgerid,@Param("companyid") int companyid,@Param("financialyear") String financialyear);

	@Transactional
	@Modifying
	@Query(value = "exec yearlybudget @action=:action,@sumestimate=:sumestimate,@sanctioned=:sanctioned,@yearlybudgetid=:yearlybudgetid,@ledgerid=:ledgerid", nativeQuery = true)
	int updateBudgetDetails(@Param("action") String action,@Param("sumestimate") Double sumestimate,@Param("sanctioned") Double sanctioned,@Param("yearlybudgetid") int yearlybudgetid,@Param("ledgerid") int ledgerid);

	
	@Transactional
	@Modifying
	@Query(value = "exec yearlybudget @action=:action,@revise=:revise,@additional=:additional,@sanctioned=:sanctioned,@yearlybudgetid=:yearlybudgetid,@ledgerid=:ledgerid", nativeQuery = true)
	int updateBudgetDetailsRev(@Param("action") String action,@Param("revise") Double revise,@Param("additional") Double additional,@Param("sanctioned") Double sanctioned,@Param("yearlybudgetid") int yearlybudgetid,@Param("ledgerid") int ledgerid);


}
