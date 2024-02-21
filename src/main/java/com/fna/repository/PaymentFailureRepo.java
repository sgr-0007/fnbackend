package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.PaymentFailure;

public interface PaymentFailureRepo extends JpaRepository<PaymentFailure, Integer> {

}
