package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fna.model.DebitHsn;

public interface DebitHsnRepo extends JpaRepository<DebitHsn, Integer> {
	@Query(value="exec getDebithsnVoucher",nativeQuery=true)
	List<DebitHsn> getDrHsn(); 
}
