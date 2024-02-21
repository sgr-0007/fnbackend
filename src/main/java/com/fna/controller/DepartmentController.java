package com.fna.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.Department;
import com.fna.model.DepartmentSection;
import com.fna.service.DepartmentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")

public class DepartmentController {
	@Autowired
	private  DepartmentService departmentservice;
	@GetMapping("/departmentsoffices")
    public ResponseEntity<List<Department>> findDepartmentsOffices() {     
	return departmentservice.getDepartmentsOffices();
    }
	@GetMapping("/departmentssections")
    public ResponseEntity<List<DepartmentSection>> findDepartmentsSection() {     
	return departmentservice.getDepartmentsSections();
    }
}
