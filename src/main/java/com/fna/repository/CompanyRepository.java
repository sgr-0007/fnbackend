package com.fna.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.Company;
import com.fna.model.Group;

public interface CompanyRepository extends JpaRepository<Company,Integer> {

	@Query(value = "select * from companymaster where companyid= :companyid", nativeQuery = true)	 
	List<Company> findByCompanyId(@Param("companyid") int companyid);

	@Query(value="exec openclosedaybookbind",nativeQuery=true)
	List<Group> getOpencloseDaybookBind(); 
	
	@Query(value = "select * from companymaster where companytypeid= :companyid or companytypeid= :branchid", nativeQuery = true)	 
	List<Company> findBytype(@Param("companyid") int companyid ,@Param("branchid") int branchid);
	
	@Query(value = "exec CheckUnique @action=:action,@id=:id,@name=:name ", nativeQuery = true)
	Boolean checkUnique(@Param("action") String action,@Param("id") int id,@Param("name") String name); 
	
	@Query(value = "select * from companymaster where companytypeid= :companyid", nativeQuery = true)	 
	List<Company> findByCompanytype(@Param("companyid") int companyid);
	
	@Query(value = "exec getUserOfficeMapping @userid=:userid", nativeQuery = true)
	List<Company> findByUserID(@Param("userid") int userid); 
	
	@Query(value = "exec getUserOfficeMappingLogin @userid=:userid,@companyid=:companyid", nativeQuery = true)
	Company findByUserIDCompanyID(@Param("userid") int userid,@Param("companyid") int companyid); 

} 
