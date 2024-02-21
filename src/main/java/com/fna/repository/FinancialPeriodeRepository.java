package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fna.model.FinancialYearDetails;

public interface FinancialPeriodeRepository extends JpaRepository<FinancialYearDetails,Integer> {

	@Query(value="select * from financialyear where defaultactive=1",nativeQuery = true)
	public FinancialYearDetails getInvoicePeriod();
	@Query(value="select * from financialyear",nativeQuery = true)
	public List<FinancialYearDetails> getAllFY();
}
