package com.fna.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.User;
import com.fna.model.UserDetails;
import com.fna.model.UserModuleCheckDetails;
import com.fna.model.UserRoleMappingView;
import com.fna.model.UserRoleOfficeDetails;
import com.fna.repository.UserDetailsRepository;
import com.fna.repository.UserModuleCheckRepository;
import com.fna.repository.UserRepository;
import com.fna.repository.UserRoleMappingViewRepository;
import com.fna.repository.UserRoleOfficeRepo; 
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserDetailsRepository userDetailsRepository;
	@Autowired
	private UserModuleCheckRepository userModuleCheckRepo;
	@Autowired
	private UserRoleMappingViewRepository userRoleCheckRepo;
	@Autowired
	private UserRoleOfficeRepo userRepo;
	public ResponseEntity<List<User>> getUsers() {
		try {
			System.out.println("user Service ");
			List<User> user = new ArrayList<User>();
			System.out.println(userRepository.findAll());
			userRepository.findAll().forEach(user::add);
			for(User u:user) {
				System.out.println("users "+u);
			}
			if (user.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(user, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	public ResponseEntity<List<UserDetails>> getUsersList() {
		try {
			System.out.println("user Service ");
			List<UserDetails> user = new ArrayList<UserDetails>();
			System.out.println(userDetailsRepository.getUserList());
			userDetailsRepository.getUserList().forEach(user::add);
		
			if (user.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(user, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	public  ResponseEntity<User> saveUser(User user) {
		try {
			userRepository.save(user);
			return new ResponseEntity<>(user, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	public ResponseEntity<User> getUserById(int userid) {
		Optional<User> groupData = userRepository.findById(userid);
		if (groupData.isPresent()) {
			return new ResponseEntity<>(groupData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	public ResponseEntity <User> UpdateUser(int userid,User user) 
	{
		Optional<User> existingGroup = userRepository.findById(userid);
		if (existingGroup.isPresent()) {
		User _user = existingGroup.get();
		_user.setUserid(user.getUserid());
		_user.setEmployeeId(user.getEmployeeId());
		_user.setUserfirstname(user.getUserfirstname());
		_user.setUserlastname(user.getUserlastname());
		_user.setUsermiddlename(user.getUsermiddlename());
		_user.setUserloginname(user.getUserloginname());
		_user.setEmailid(user.getEmailid());
		_user.setMobilenumber(user.getMobilenumber());
		_user.setDob(user.getDob());
		_user.setReportingmanager(user.getReportingmanager());
		_user.setDesignation(user.getDesignation());
		_user.setOriginaldepartment(user.getOriginaldepartment());
		_user.setCurrentdepartment(user.getCurrentdepartment());
		_user.setPost(user.getPost());
		_user.setPassword(user.getPassword());
		return new ResponseEntity<>(userRepository.save(_user), HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
}

	
	public boolean checkUserName(String empid) {
		System.out.println(empid);
		boolean exist=userRepository.findByemployeeId(empid).isPresent();
		System.out.println(exist);
		if(exist) {
		return true;
		}else {
			return false;
		}	
		
	}
	public Boolean checkUniqueUserName(int id,String name) {
		   return userRepository.checkUniqueUserName("checkifuniqueusername", id, name);
			}
	public Boolean checkUniqueEid(int id,String empid) {
		   return userRepository.checkUniqueEid("checkifuniqueemployeeid", id, empid);
			}

	public ResponseEntity<List<UserModuleCheckDetails>> userModuleCheck(int userid) {
		try {
			System.out.println("user Service ");
			List<UserModuleCheckDetails> user = new ArrayList<UserModuleCheckDetails>();
			System.out.println(userModuleCheckRepo.userModuleCheck(userid));
			userModuleCheckRepo.userModuleCheck(userid).forEach(user::add);
			
			if (user.isEmpty()) {
				System.out.println("empty");
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(user, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<UserRoleMappingView> userRoleCheck(int userid,int moduleid) {
		try {

			UserRoleMappingView user = new UserRoleMappingView();
			user = userRoleCheckRepo.userRoleCheck(userid,moduleid);
			
			if (user.getRolemappingid()==0) {
				System.out.println("empty");
				return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(user, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	public ResponseEntity<UserRoleOfficeDetails> userRoleOfficeDetails(int userid) {
		// TODO Auto-generated method stub
		UserRoleOfficeDetails userRod=userRepo.getUserRoleOfficeDetails(userid);
		return new ResponseEntity<>(userRod,HttpStatus.ACCEPTED);
	}
	
	public boolean checkMobileNumber(String mobilenumber) {
		System.out.println(mobilenumber);
		boolean exist=userRepository.findByMobilenumber(mobilenumber);
		System.out.println(exist);
		
		return !exist;
			
		
	}
	
}
