package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fna.model.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

	@Query(value = "exec getUsers", nativeQuery = true)
	List<UserDetails> getUserList(); 

	
}
