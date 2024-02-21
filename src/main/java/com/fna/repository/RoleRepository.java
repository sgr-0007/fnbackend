package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	@Query(value = "exec CheckUnique @action=:action,@id=:id,@name=:name ", nativeQuery = true)
	Boolean checkUnique(@Param("action") String action,@Param("id") int id,@Param("name") String name); 
} 
