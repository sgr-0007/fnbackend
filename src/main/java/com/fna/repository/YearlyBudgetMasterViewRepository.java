package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.YearlyBudgetMasterView;

public interface YearlyBudgetMasterViewRepository extends JpaRepository<YearlyBudgetMasterView, Integer> {

	@Query(value = "exec yearlybudget @action=:action,@userid=:userid", nativeQuery = true)
	List<YearlyBudgetMasterView> ybMasterView(@Param("action") String action,@Param("userid") int userid); 
}
