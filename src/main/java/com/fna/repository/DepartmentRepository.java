package com.fna.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.fna.model.Department;



public interface DepartmentRepository extends JpaRepository<Department,Integer>{

	
	@Query(value = "SELECT departmentid as officenameid,departmentname as officename,departmentdescription,isactive,createdby,createddate,modifiedby,modieddate from departmentmaster", nativeQuery = true)
	List<Department> officeName(); 
	
}
