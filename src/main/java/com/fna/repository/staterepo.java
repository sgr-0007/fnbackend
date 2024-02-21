package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.State;

public interface staterepo extends JpaRepository<State, Integer> {

}
