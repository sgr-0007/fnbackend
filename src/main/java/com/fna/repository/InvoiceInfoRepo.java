package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fna.model.InvoiceInfo;

public interface InvoiceInfoRepo extends JpaRepository<InvoiceInfo, Integer>{
	@Query(value="exec getAllInvoice",nativeQuery=true)
	List<InvoiceInfo> getInvoiceDetails();
}
