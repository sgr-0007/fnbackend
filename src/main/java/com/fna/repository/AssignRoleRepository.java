package com.fna.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.fna.model.AssignRole;

public interface AssignRoleRepository  extends JpaRepository<AssignRole, Integer>{

	Optional<List<AssignRole>> findByRoleid(int role);
	Optional<List<AssignRole>> findByUserid(int userid);
	int deleteByUserid(int userid);
	@Query(value="exec checkmodulebyuserid @userid=:userid,@path=:path ",nativeQuery=true)
	Boolean checkModuleByuserid(@Param("userid") int userid,@Param("path") String path);
}
