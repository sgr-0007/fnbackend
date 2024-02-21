package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.Ledgeropeningtemp;

public interface Ledgeropeningtemprepo extends JpaRepository<Ledgeropeningtemp, Integer> {

	@Query(value="exec getOpMaster",nativeQuery=true)
	List<Ledgeropeningtemp> getAllOp();
	
		
}
