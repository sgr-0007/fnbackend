package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.PaymentType;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, Integer>{

}
