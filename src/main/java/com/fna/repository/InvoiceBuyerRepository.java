package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.InvoiceBuyerDetails;

public interface InvoiceBuyerRepository extends JpaRepository<InvoiceBuyerDetails, Integer> {

	@Query(value="exec sp_allsalesledger @cmpid=:companyid" ,nativeQuery = true)
	List<InvoiceBuyerDetails> getAllSalesLedger(@Param("companyid") int companyid);
	@Query(value="exec sp_getAllPurchaseLedger @cmpid=:companyid" ,nativeQuery = true)
	List<InvoiceBuyerDetails> getAllPurchaseLedger(@Param("companyid") int companyid);
}
