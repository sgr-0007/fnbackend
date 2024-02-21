package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.StateGst;

public interface StateGstRepo extends JpaRepository<StateGst, Integer> {

	
	@Query(value = "exec getStatesbyGst @gstcode=:gstcode", nativeQuery = true)
	StateGst StatesByGst(@Param("gstcode") Integer gstcode);
}
