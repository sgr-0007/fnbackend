package com.fna.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.Daybookopeningclosing;

public interface Daybookopeningclosingrepo extends JpaRepository<Daybookopeningclosing, Integer> {

	Optional<Daybookopeningclosing> findBycompanyid(Integer companyid);
 
	Optional<Daybookopeningclosing> findByledgerid(int ledgerid);

	
	@Query(value = "SELECT * from daybookopeningclosing where ledgerid= :ledgerid and companyid= :companyid and daybookdate= :daybookdate", nativeQuery = true)
	Optional<Daybookopeningclosing> findbookdate(@Param("ledgerid") int ledgerid,@Param("companyid") int companyid,@Param("daybookdate") String daybookdate);

	 
}
