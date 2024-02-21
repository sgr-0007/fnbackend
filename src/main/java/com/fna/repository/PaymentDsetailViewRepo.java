package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.PaymentDetailsView;

public interface PaymentDsetailViewRepo extends JpaRepository<PaymentDetailsView, Integer> {

	List<PaymentDetailsView> findByPaymentid(int paymentid);
}
