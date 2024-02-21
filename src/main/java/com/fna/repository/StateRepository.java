package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.fna.model.StateDetails;

public interface StateRepository extends JpaRepository<StateDetails, Integer>{

	@Procedure("getStates")
	List<StateDetails>  getStateList();
}
