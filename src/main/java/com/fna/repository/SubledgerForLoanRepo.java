package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.SubledgerForLoan;

public interface SubledgerForLoanRepo extends JpaRepository<SubledgerForLoan, Integer>{

	public List<SubledgerForLoan> findByauctionoradmin(int auctionoradmin);
	public SubledgerForLoan findByloancode(int loancode);
}
