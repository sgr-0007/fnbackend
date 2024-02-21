package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fna.model.CreditHsn;

public interface CreditHsnRepo extends JpaRepository<CreditHsn, Integer> {
	@Query(value="exec getCredithsnVoucher",nativeQuery=true)
	List<CreditHsn> getCrHsn(); 
}
