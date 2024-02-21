package com.fna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.ModuleType;
import com.fna.repository.ModuleRepository;

@Service
public class ModuleTypeService {

	@Autowired
	private ModuleRepository moduleRepo;
	
	public ResponseEntity<List<ModuleType>> getModuleType(){
		List<ModuleType> module=moduleRepo.findAll();
		return  new ResponseEntity<>(module,HttpStatus.OK);
	}
}
