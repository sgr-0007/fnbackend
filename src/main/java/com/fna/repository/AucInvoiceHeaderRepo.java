package com.fna.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.AucInvoiceHeader;

public interface AucInvoiceHeaderRepo extends JpaRepository<AucInvoiceHeader, Integer> {

	public Optional<AucInvoiceHeader> findByInvoiceNo(int invoiceNo);
	@Query(value = "exec InvoiceAucTotal @invno=:invoiceNo", nativeQuery = true)
	double getInvoiceValue(@Param("invoiceNo") int invoiceNo);
	@Modifying
	@Query(value = " update aucinvoice_header set voucherstatus=3 where Invoice_No=:invoiceNo", nativeQuery = true)
	int updateinvoiceaftervoucher(@Param("invoiceNo") int invoiceNo);
	@Modifying
	@Query(value = " update aucinvoice_header set voucherstatus=5 where Invoice_No=:invoiceNo", nativeQuery = true)
	int updateinvoiceafterpay(@Param("invoiceNo") int invoiceNo);
	@Modifying
	@Query(value = " update aucinvoice_header set voucherstatus=2 ,status=1 where invid=:invid", nativeQuery = true)
	int approveaucinvoice(@Param("invid") int invid);
	
	
}
