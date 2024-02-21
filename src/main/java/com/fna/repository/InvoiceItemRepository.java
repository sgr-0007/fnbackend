package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.InvoiceItemDetails;

public interface InvoiceItemRepository extends JpaRepository<InvoiceItemDetails, Integer> {


	@Query(value="exec getInvoiceDetailByInvId @p1=:invoiceId",nativeQuery=true)
	List<InvoiceItemDetails> getInvoiceItemDetails(@Param("invoiceId")int invoiceId);
	
}
