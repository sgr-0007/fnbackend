package com.fna.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.AssignOffice;

public interface UserOffice extends JpaRepository<AssignOffice, Integer> {

	Optional<List<AssignOffice>> findByUserid(int userid);
	int deleteByUserid(int userid);
	
	@Query(value = "select top 1 officeid from userofficemapping where userid= :userid", nativeQuery = true)
	Integer Selectedoffice(@Param("userid") int userid);	
	

}
