package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.User;

public interface RegistrationRepository extends JpaRepository<User, Integer>{
	
	
	public User findByuserloginname(String userloginname);
	public User findByuserloginnameAndPassword(String userloginname, String password);
	

}

