package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.PaymentTerm;

public interface PaymentTermRepository extends JpaRepository<PaymentTerm, Integer>{

}
