package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.Cashbook;


public interface Cashbookrepository extends JpaRepository<Cashbook, Integer> {

	@Query(value = "exec cashbook @fromdate=:fromdate,@todate=:todate,@aid=:aid ", nativeQuery = true)
	List<Cashbook> findCashBook(@Param("fromdate") String fromdate,@Param("todate") String todate,@Param("aid") int aid);  
	
}
