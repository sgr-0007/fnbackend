package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

	@Query(value="select * from payment where invoiceid=:id",nativeQuery=true)
	public Payment getPaymentByInvoiceId(@Param("id") int id);
	public Payment findByinvoiceId(int invoiceId);
}
