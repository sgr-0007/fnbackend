package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.City;

public interface cityrepo extends JpaRepository<City, Integer> {

	public List<City> findBystateid(int stateId);
}
