package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.gstBuyerVendorDdl;

public interface gstBuyerVendorDdlRepo extends JpaRepository<gstBuyerVendorDdl, Integer> {
	@Query(value = "select ledgerid as gstbvledgerid, ledgeralias as gstbvledgeralias from normalledgermaster where (companyid= :companyid or 0=0) and undergroups is not null", nativeQuery = true)	 
	List<gstBuyerVendorDdl> findgstBuyerVendor(@Param("companyid") int companyid);
}
