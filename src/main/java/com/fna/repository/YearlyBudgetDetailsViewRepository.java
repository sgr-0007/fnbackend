package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.fna.model.YearlyBudgetDetailsView;

public interface YearlyBudgetDetailsViewRepository extends JpaRepository<YearlyBudgetDetailsView, Integer> {

	
	@Query(value = "exec yearlybudget @yearlybudgetid=:yearlybudgetid,@action=:action ", nativeQuery = true)
	List<YearlyBudgetDetailsView> yearlyBudgetDetailsView(@Param("yearlybudgetid") int yearlybudgetid,@Param("action") String action); 
	
	@Query(value = "exec yearlybudget @action=:action", nativeQuery = true)
	List<YearlyBudgetDetailsView> CurrentFinancialYearlyBudgetDetailsView(@Param("action") String action); 
	
	@Query(value = "exec yearlybudget @action=:action,@ledgerid=:ledgerid ", nativeQuery = true)
	YearlyBudgetDetailsView CheckFinancialYearlyBudgetDetailsView(@Param("action") String action,@Param("ledgerid") int ledgerid);
	
	@Query(value = "exec yearlybudget @action=:action,@ledgerid=:ledgerid", nativeQuery = true)
	Double ledgerBalanceBudget(@Param("action") String action,@Param("ledgerid") int ledgerid);
	
	@Query(value = "exec yearlybudget @action=:action,@ledgerid=:ledgerid", nativeQuery = true)
	Double ledgerUsed(@Param("action") String action,@Param("ledgerid") int ledgerid);
	
	@Transactional
	@Modifying
	@Query(value = "exec yearlybudget @action=:action,@yearlybudgetdetailsid=:yearlybudgetdetailsid,@used=:used", nativeQuery = true)
	int updateUsedBalance(@Param("action") String action,@Param("yearlybudgetdetailsid") int yearlybudgetdetailsid,@Param("used") Double used);

	
}
