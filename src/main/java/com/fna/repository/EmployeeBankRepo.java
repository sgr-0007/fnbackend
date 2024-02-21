package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.EmployeeBank;

public interface EmployeeBankRepo extends JpaRepository<EmployeeBank, Integer>{

	
}
