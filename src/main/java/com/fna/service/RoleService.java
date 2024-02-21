package com.fna.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.fna.model.Role;
import com.fna.repository.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository; 

	public ResponseEntity<Role> saveRole(Role role) {		
		try {
			roleRepository.save(role);
			return new ResponseEntity<>(role, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<Role>> getRoles() {
	   try 
	   {
		List<Role> role = new ArrayList<Role>();        
		roleRepository.findAll().forEach(role::add);
        if(role.isEmpty())
        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
        }
        return new ResponseEntity<>(role,HttpStatus.OK);
	   }
	   catch (Exception e) {
		   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
	
	public ResponseEntity<Role> getRoleById(int roleid) {
		Optional<Role> roleData = roleRepository.findById(roleid);
		if (roleData.isPresent()) {
			return new ResponseEntity<>(roleData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	    }
	
	public ResponseEntity<Role> updateRole(int roleid,Role role) {
		Optional<Role> existingRole = roleRepository.findById(roleid);
		if (existingRole.isPresent()) {
			Role _role = existingRole.get(); 
			_role.setRolename(role.getRolename());
			_role.setRoledescription(role.getRoledescription());
			_role.setIsactive(role.isIsactive());		
			return new ResponseEntity<>(roleRepository.save(_role), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} 
	
    }
	public Boolean checkUnique(int id,String name) {
		   return roleRepository.checkUnique("checkifuniquerolename", id, name);
			}

	

}
