package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fna.model.BranchVoucher;

public interface BranchVoucherRepo extends JpaRepository<BranchVoucher, Integer> {
	@Query(value="exec getBranches",nativeQuery=true)
	List<BranchVoucher> getBranches(); 
}
