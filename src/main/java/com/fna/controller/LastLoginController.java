package com.fna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.LastLogin;
import com.fna.service.LastLoginService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class LastLoginController {
	
	@Autowired
	private LastLoginService loginservice;
	
	@PutMapping("/lastlogindetails/{userid}")
	public ResponseEntity<LastLogin> savelastLogin(@PathVariable int userid){
		
		return loginservice.saveLastLogin(userid);
	}

	@GetMapping("/lastlogin/{userid}")
	public ResponseEntity<LastLogin> getLastLoginByUser(@PathVariable int userid){
		return loginservice.getLastLogin(userid);
	}
}
