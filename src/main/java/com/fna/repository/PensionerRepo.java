package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.Pensioner;

public interface PensionerRepo extends JpaRepository<Pensioner, Integer> {

}
