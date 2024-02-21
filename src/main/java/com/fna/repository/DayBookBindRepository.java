package com.fna.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.DaybookBind;

public interface DayBookBindRepository extends JpaRepository<DaybookBind, Integer> {

	@Query(value = "exec openclosedaybookbind @companyid=:companyid,@daybookdate=:daybookdate,@userid=:userid", nativeQuery = true)
	DaybookBind dayBookBind(@Param("companyid") int companyid,@Param("daybookdate") String daybookdate,@Param("userid") int userid); 
	
}
