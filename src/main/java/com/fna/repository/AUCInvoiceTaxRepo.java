package com.fna.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.AUCInvoiceTaxes;


public interface AUCInvoiceTaxRepo extends JpaRepository<AUCInvoiceTaxes, Integer>{

	public Optional<List<AUCInvoiceTaxes>> findByInvoiceNo(int invoiceNo);
}
