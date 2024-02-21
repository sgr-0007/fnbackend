package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.fna.model.VoucherGst;

public interface VoucherGstRepo extends JpaRepository<VoucherGst, Integer> {
	@Query(value="exec getgstIt",nativeQuery=true)
	List<VoucherGst> getgstIT();
}
