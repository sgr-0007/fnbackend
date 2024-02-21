package com.fna.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.CompanyType; 
public interface CompanyTypeRepository extends JpaRepository<CompanyType,Integer>
{
	@Query(value = "select * from companttype where companytype= :companytype", nativeQuery = true)	 
	List<CompanyType> findByCompanyType(@Param("companytype") int companytype);
}
