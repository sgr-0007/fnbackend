package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.YearlyBudgetDetailsHistoryOfHistory;

public interface YearlyBudgetDetailsHistoryOfHistoryRepository extends JpaRepository<YearlyBudgetDetailsHistoryOfHistory, Integer>{

	@Query(value = "select * from yearlybudgetdetailshistoryofhistory where yearlybudgetdetailshistoryid= :yearlybudgetdetailshistoryid", nativeQuery = true)	 
	List<YearlyBudgetDetailsHistoryOfHistory> findByHid(@Param("yearlybudgetdetailshistoryid") int yearlybudgetdetailshistoryid);
	
}
