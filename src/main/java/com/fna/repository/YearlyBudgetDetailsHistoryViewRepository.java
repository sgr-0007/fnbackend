package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.YearlyBudgetDetailsHistoryView;

public interface YearlyBudgetDetailsHistoryViewRepository extends JpaRepository<YearlyBudgetDetailsHistoryView, Integer> {

	
	@Query(value = "exec yearlybudget @yearlybudgetid=:yearlybudgetid,@ledgerid=:ledgerid,@action=:action ", nativeQuery = true)
	List<YearlyBudgetDetailsHistoryView> yearlyBudgetDetailsViewHistory(@Param("yearlybudgetid") int yearlybudgetid,@Param("ledgerid") int ledgerid,@Param("action") String action); 

}
