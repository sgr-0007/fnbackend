package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.UserRoleOfficeDetails;

public interface UserRoleOfficeRepo extends JpaRepository<UserRoleOfficeDetails, Integer>{

	@Query(value = "exec UserRoleDetails @userid=:userid ", nativeQuery = true)
	public  UserRoleOfficeDetails getUserRoleOfficeDetails(@Param("userid") int userid);
	
	
}
