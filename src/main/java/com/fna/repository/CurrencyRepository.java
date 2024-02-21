package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.fna.model.Currency;

public interface CurrencyRepository extends JpaRepository<Currency,Integer>{

	
}
