package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.User;
import com.fna.service.RegistrationService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class RegistrationController {
	
	
	@Autowired
	
	private RegistrationService service;
	
	@CrossOrigin(origins = "*")
	
	@PostMapping("/login")
	
	public User loginUser(@RequestBody User user) throws Exception {
		String tempUserName  = user.getUserloginname();
		String temppass = user.getPassword();
		User userObj = null;
	if(tempUserName != null && temppass != null)	{
		userObj = service.fetchUserByuserloginnameAndPassword(tempUserName, temppass);
		
	}
	
	if(userObj == null) {
		throw new Exception("Bad credentials");
	}
	
	return userObj;
	
		
	}	
	
	@PutMapping("/update")
	public User updateLogin(@RequestBody User user ) {
		return service.updatePasswordByName(user);
	}
	
	
	@GetMapping("/user")
	public List<User> getUserDetails() {
		return service.getUser();
	}


}
