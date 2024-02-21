package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.UserModuleCheckDetails;

public interface UserModuleCheckRepository extends JpaRepository<UserModuleCheckDetails, Integer> {
	
	@Query(value = "exec userModuleCheck @userid=:userid ", nativeQuery = true)
	List<UserModuleCheckDetails> userModuleCheck(@Param("userid") int userid); 


}
