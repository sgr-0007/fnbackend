package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.InvoiceItemDetails;
import com.fna.model.PaymentView;

public interface PaymentViewRepository extends JpaRepository<PaymentView, Integer>{

	@Query(value="exec sp_getPaymentDetails @id=0",nativeQuery=true)
	List<PaymentView> getPaymentview();
	@Query(value="exec sp_getPaymentDetails @id=:id",nativeQuery=true)
	PaymentView getPaymentviewById(@Param("id")int paymentId);
}
