package com.fna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fna.model.AssignOffice;
import com.fna.model.AssignRole;
import com.fna.model.DefaultRoleModule;
import com.fna.model.Userpath;
import com.fna.service.AssignRoleService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class AssignRolesController {

	@Autowired
	private AssignRoleService roleService;
	@PostMapping("role/assign")
	public ResponseEntity<List<AssignRole>> assignRoles(@RequestBody AssignRole role){
		return roleService.assignrole(role);
	}
	
	@GetMapping("getuserrolemodulebyuiserid/{userid}")
	public ResponseEntity<List<AssignRole>> getassignRoles(@PathVariable int userid){
		return roleService.getUserRoleModuleByUserid(userid);
	}
	@PostMapping("role/assign/office")
	public ResponseEntity<List<AssignOffice>> assignRolesOffice(@RequestBody AssignOffice role){
		return roleService.assignroleoffice(role);
	}
	@GetMapping("officebyrole/{userid}")
	public ResponseEntity<List<AssignOffice>> getofficeByUser(@PathVariable("userid") int userid){
		return roleService.getOfficeByUser(userid);
	}
	@GetMapping("modulebyrole/{roleid}")
	public ResponseEntity<List<DefaultRoleModule>> getDefaultModuleByRole(@PathVariable("roleid") int role){
		return roleService.getDefaultModule(role);
	}
	
	@PostMapping("checkavailablemodule")
	public ResponseEntity<Boolean> checkAvailableModuleByUser(@RequestBody Userpath userpath){
		System.out.println(userpath.path);
		return roleService.checkModuleByUserId(userpath.userid,userpath.path);
	}
	
}
