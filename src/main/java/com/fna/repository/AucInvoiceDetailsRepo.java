package com.fna.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.AucInvoiceDetails;
import com.fna.model.AucInvoiceHeader;

public interface AucInvoiceDetailsRepo extends JpaRepository<AucInvoiceDetails, Integer>{

	public Optional<List<AucInvoiceDetails>> findByinvoiceNo(int invoiceNo);
}
