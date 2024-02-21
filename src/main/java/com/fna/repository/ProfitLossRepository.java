package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.ProfitLossDetails;


public interface ProfitLossRepository extends JpaRepository<ProfitLossDetails, Integer> {

	@Query(value = "exec profitloss @action=:action,@fromdate=:fromdate,@todate=:todate ", nativeQuery = true)
	List<ProfitLossDetails> profitLossBind(@Param("action") String action,@Param("fromdate") String fromdate,@Param("todate") String todate); 
	
}
