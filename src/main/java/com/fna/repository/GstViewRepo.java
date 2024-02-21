package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.GstView;

public interface GstViewRepo extends JpaRepository<GstView, Integer> {
	
	@Query(value = "exec getGstView @vid=:vid", nativeQuery = true)
	List<GstView> getGstList(@Param("vid") int vid); 

}
