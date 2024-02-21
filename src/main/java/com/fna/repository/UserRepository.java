package com.fna.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.User;
public interface UserRepository extends JpaRepository<User,Integer> {

	public Optional<User> findByemployeeId(String employeeId);
	@Query(value = "exec CheckUnique @action='checkifuniquemobilenumber',@name=:mobilenumber ", nativeQuery = true)
	public Boolean findByMobilenumber(@Param("mobilenumber")  String mobilenumber);
	@Query(value = "exec CheckUnique @action=:action,@id=:id,@name=:name ", nativeQuery = true)
	Boolean checkUniqueUserName(@Param("action") String action,@Param("id") int id,@Param("name") String name); 
	
	@Query(value = "exec CheckUnique @action=:action,@id=:id,@empid=:empid ", nativeQuery = true)
	Boolean checkUniqueEid(@Param("action") String action,@Param("id") int id,@Param("empid") String  empid); 
} 
