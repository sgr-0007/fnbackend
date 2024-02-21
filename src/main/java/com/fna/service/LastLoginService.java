package com.fna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.LastLogin;
import com.fna.repository.LastLoginRepo;

@Service
public class LastLoginService {

	@Autowired
	private LastLoginRepo lastloginRepo;
	
	public ResponseEntity<LastLogin> saveLastLogin(int userid){
		LastLogin lastLogin=new LastLogin();
		lastLogin.setUserid(userid);
		lastloginRepo.save(lastLogin);
		return new ResponseEntity<>(lastLogin,HttpStatus.OK);
	}
	
	public ResponseEntity<LastLogin> getLastLogin(int userid){
		LastLogin lastLogin=new LastLogin();
		lastLogin=lastloginRepo.findByuserid(userid);
		return new ResponseEntity<>(lastLogin,HttpStatus.OK);
	}
	
	
	
}
