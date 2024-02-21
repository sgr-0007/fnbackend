package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.CreditLimit;

public interface CreditLimitRepo extends JpaRepository<CreditLimit, Integer>{
	
	
	public CreditLimit findBybuyerId(int buyerid);
	
}
