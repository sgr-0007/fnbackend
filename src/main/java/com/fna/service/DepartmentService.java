package com.fna.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.fna.model.Department;
import com.fna.model.DepartmentSection;
import com.fna.repository.DepartmentRepository;
import com.fna.repository.DepartmentSectionRepo;
@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	@Autowired
	private DepartmentSectionRepo departmentSectionRepository;
	
	public ResponseEntity<List<Department>> getDepartmentsOffices()
	{
		try {
			System.out.println("Dep Service ");
			List<Department> department =new ArrayList<Department>();
			System.out.println(departmentRepository.officeName());
			departmentRepository.officeName().forEach(department::add);
			for(Department u:department) {
				System.out.println("departments "+u);
			}
			if(department.isEmpty())
			{
				System.out.println("empty");
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(department, HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
	
	public ResponseEntity<List<DepartmentSection>> getDepartmentsSections()
	{
		try {
			System.out.println("Dep Service ");
			List<DepartmentSection> department =new ArrayList<DepartmentSection>();
			System.out.println(departmentSectionRepository.sectionName());
			departmentSectionRepository.sectionName().forEach(department::add);
		
			if(department.isEmpty())
			{
				System.out.println("empty");
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(department, HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
}

