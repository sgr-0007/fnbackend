package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.Subgroup;

public interface SubgroupRepository extends JpaRepository<Subgroup,Integer>{

	@Query(value = "exec getSubGroups", nativeQuery = true)
	List<Subgroup> SubGroupNative();
	
	@Query(value = "exec CheckUnique @action=:action,@id=:id,@name=:name ", nativeQuery = true)
	Boolean checkUnique(@Param("action") String action,@Param("id") int id,@Param("name") String name); 
}
