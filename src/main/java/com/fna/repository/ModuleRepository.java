package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.ModuleType;

public interface ModuleRepository extends JpaRepository<ModuleType, Integer>{

}
