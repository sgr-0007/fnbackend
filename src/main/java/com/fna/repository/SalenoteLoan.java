package com.fna.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import com.fna.model.AUCSalenoteLoan;

public interface SalenoteLoan extends JpaRepository<AUCSalenoteLoan, Integer>{
	@Modifying
	@Query(value="select * from aucgrower_loan_details where TBGRNO=:tbgrno and Loan_Sanction_Date=:date",nativeQuery = true)
	public Optional<List<AUCSalenoteLoan>> findByTBGRNowithDate(int tbgrno,Date date);
	
}
