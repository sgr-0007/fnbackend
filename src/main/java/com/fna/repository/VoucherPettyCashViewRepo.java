package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.VoucherPettyCashView;

public interface VoucherPettyCashViewRepo extends JpaRepository<VoucherPettyCashView, Integer> {

	@Query(value = "exec voucherpettyview @fromdate=:fromdate,@todate=:todate ", nativeQuery = true)
	List<VoucherPettyCashView> VoucherPettycashView(@Param("fromdate") String fromdate,@Param("todate") String todate); 
	
	 
}
