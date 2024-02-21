package com.fna.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.CompanyType;
import com.fna.service.CompanyTypeService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CompanyTypeController
{
	@Autowired
	private CompanyTypeService companytypeservice;
	@GetMapping("/companytypes")
    public ResponseEntity<List<CompanyType>> findCompanyTypes()
	{     
	return companytypeservice.getCompanyTypes();
    }
}
