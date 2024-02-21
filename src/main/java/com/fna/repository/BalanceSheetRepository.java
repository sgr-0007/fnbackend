package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.BalanceSheetDetails;

public interface BalanceSheetRepository extends JpaRepository<BalanceSheetDetails, Integer> {

	@Query(value = "exec balancesheet @action=:action,@fromdate=:fromdate,@todate=:todate ", nativeQuery = true)
	List<BalanceSheetDetails> balanceSheetBind(@Param("action") String action,@Param("fromdate") String fromdate,@Param("todate") String todate); 

}
