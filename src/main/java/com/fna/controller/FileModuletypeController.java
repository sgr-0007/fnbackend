package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.ModuleType;
import com.fna.service.ModuleTypeService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class FileModuletypeController {

	@Autowired
	private ModuleTypeService moduleService;
	@GetMapping("/module/type")
	public ResponseEntity<List<ModuleType>> getModuletype(){
		return moduleService.getModuleType();
	}
}
