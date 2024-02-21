package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.fna.model.YearlyBudgetDetailsHistory;

public interface YearlyBudgetDetailsHistoryRepository extends JpaRepository<YearlyBudgetDetailsHistory, Integer> {
	
	@Transactional
	@Modifying
	@Query(value = "exec yearlybudget @action=:action,@statusid=:statusid,@checkedby=:checkedby,@approvedby=:approvedby,@yearlybudgetdetailshistoryid=:yearlybudgetdetailshistoryid", nativeQuery = true)
	int updateStatus(@Param("action") String action,@Param("statusid") int statusid,@Param("checkedby") int checkedby,@Param("approvedby") int approvedby,@Param("yearlybudgetdetailshistoryid") int yearlybudgetdetailshistoryid);
	
	@Transactional
	@Modifying
	@Query(value = "exec yearlybudget @action=:action,@neww=:neww,@sanctioned=:sanctioned,@yearlybudgetdetailshistoryid=:yearlybudgetdetailshistoryid", nativeQuery = true)
	int updateBudgetHistory(@Param("action") String action,@Param("neww") Double neww,@Param("sanctioned") Double sanctioned,@Param("yearlybudgetdetailshistoryid") int yearlybudgetdetailshistoryid);
	
	@Query(value = "exec yearlybudget @action=:action,@yearlybudgetid=:yearlybudgetid,@ledgerid=:ledgerid", nativeQuery = true)
	Double getEst(@Param("action") String action,@Param("yearlybudgetid") int yearlybudgetid,@Param("ledgerid") int ledgerid);
	
	@Query(value = "exec yearlybudget @action=:action,@yearlybudgetid=:yearlybudgetid,@ledgerid=:ledgerid", nativeQuery = true)
	Double getSanct(@Param("action") String action,@Param("yearlybudgetid") int yearlybudgetid,@Param("ledgerid") int ledgerid);
	
	@Transactional
	@Modifying
	@Query(value = "exec yearlybudget @action=:action,@sanctioned=:sanctioned,@revise=:revise,@additional=:additional,@yearlybudgetdetailshistoryid=:yearlybudgetdetailshistoryid", nativeQuery = true)
	int updateBudgetHistoryRevise(@Param("action") String action,@Param("sanctioned") Double sanctioned,@Param("revise") Double revise,@Param("additional") Double additional,@Param("yearlybudgetdetailshistoryid") int yearlybudgetdetailshistoryid);

	@Query(value = "exec yearlybudget @action=:action,@yearlybudgetid=:yearlybudgetid,@ledgerid=:ledgerid", nativeQuery = true)
	Double getRevise(@Param("action") String action,@Param("yearlybudgetid") int yearlybudgetid,@Param("ledgerid") int ledgerid);
	
	@Query(value = "exec yearlybudget @action=:action,@yearlybudgetid=:yearlybudgetid,@ledgerid=:ledgerid", nativeQuery = true)
	Double getAddtn(@Param("action") String action,@Param("yearlybudgetid") int yearlybudgetid,@Param("ledgerid") int ledgerid);
}
