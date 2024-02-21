package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.itBuyerVendorDdl;

public interface itBuyerVendorDdlRepo extends JpaRepository<itBuyerVendorDdl, Integer> {

	@Query(value = "select ledgerid as itbvledgerid, ledgeralias as itbvledgeralias from normalledgermaster where (companyid= :companyid or 0 = 0) and undergroups is not null", nativeQuery = true)	 
	List<itBuyerVendorDdl> finditBuyerVendor(@Param("companyid") int companyid);
}
 