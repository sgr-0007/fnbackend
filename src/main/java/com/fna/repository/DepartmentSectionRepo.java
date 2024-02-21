package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.fna.model.DepartmentSection;

public interface DepartmentSectionRepo extends JpaRepository<DepartmentSection, Integer> {

	
	@Query(value = "SELECT departmentid as sectionnameid,departmentname as sectionname,departmentdescription,isactive,createdby,createddate,modifiedby,modieddate from departmentmaster", nativeQuery = true)
	List<DepartmentSection> sectionName(); 
}
