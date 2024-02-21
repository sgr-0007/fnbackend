package com.fna.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.UserRoleMappingView;

public interface UserRoleMappingViewRepository extends JpaRepository<UserRoleMappingView, Integer> {
	
	
	@Query(value = "exec userrolecheck @userid=:userid,@moduleid=:moduleid ", nativeQuery = true)
	UserRoleMappingView userRoleCheck(@Param("userid") int userid,@Param("moduleid") int moduleid); 
	
	
}
