package com.fna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fna.model.User;
import com.fna.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository repo;
	

	public User saveUser(User user) {
		
		return repo.save(user);
	}

	public User fetchUserByuserloginname(String userloginname) {
		
	return repo.findByuserloginname(userloginname);
	}
	
	public User fetchUserByuserloginnameAndPassword(String userloginname, String password) {
		
	return repo.findByuserloginnameAndPassword(userloginname, password);
	}
	
	public User updatePasswordByName(User user) {
		User userget=repo.findByuserloginname(user.getUserloginname());
		userget.setPassword(user.getPassword());
		return repo.save(userget);
		}
	public List<User> getUser() {
		return repo.findAll();
		}
}
