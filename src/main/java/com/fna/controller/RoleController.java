package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.Role;
import com.fna.service.RoleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")

public class RoleController {

	@Autowired
	private RoleService roleservice;
	
	@PostMapping("/roles")
    public ResponseEntity<Role> addRole(@RequestBody Role role) {
        return roleservice.saveRole(role); 
    }
	
	@GetMapping("/roles")
    public ResponseEntity<List<Role>> findAllRoles() {     
	return roleservice.getRoles();
    }
	
	@GetMapping("/roles/{id}")
    public ResponseEntity<Role> findRoleById(@PathVariable(value = "id") int roleid) {     
	return roleservice.getRoleById(roleid);
	
    }

    @PutMapping("/roles/{id}")
   public ResponseEntity<Role> updateRole(@PathVariable(value = "id") int roleid,
	         @RequestBody Role role) {    	
       return roleservice.updateRole(roleid,role);
   }
    @GetMapping("/checkroleuniqueonedit")
    public Boolean checkUnique(@RequestParam("id") int id ,
            @RequestParam("name") String name ) {     
	return roleservice.checkUnique(id,name);

    }

}
