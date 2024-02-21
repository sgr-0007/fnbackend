package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.ItView;

public interface ItViewRepo extends JpaRepository<ItView, Integer> {
	
	@Query(value = "exec getITView @vid=:vid", nativeQuery = true)
	List<ItView> getItList(@Param("vid") int vid); 

}
