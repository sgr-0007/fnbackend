package com.fna.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.AssignOffice;
import com.fna.model.AssignRole;
import com.fna.model.DefaultRoleModule;
import com.fna.repository.AssignRoleRepository;
import com.fna.repository.DRoleModuleMappingRepo;
import com.fna.repository.UserOffice;

@Service
public class AssignRoleService {

	@Autowired
	private AssignRoleRepository roleRepo;
	@Autowired
	private UserOffice officerepo;
	@Autowired
	private DRoleModuleMappingRepo modulebyrolerepo;
	
	@Transactional
	public ResponseEntity<List<AssignRole>> assignrole(AssignRole role){
		
		roleRepo.deleteByUserid(role.getUserid());
		List<AssignRole> bulkUpload=new ArrayList();
		for(int value:role.getModulelist()) {
			AssignRole sRole=new AssignRole();
			sRole.setUserid(role.getUserid());
			sRole.setRoleid(role.getRoleid());
			sRole.setModuleid(value);
			System.out.println(sRole);
			bulkUpload.add(sRole);
		}

		bulkUpload.parallelStream().forEach(e -> roleRepo.save(e));
		return new ResponseEntity<>(bulkUpload,HttpStatus.OK);
	}

	
	
	
	public ResponseEntity<List<AssignRole>> getUserRoleModuleByUserid(int role){
		
		return ResponseEntity.ok(roleRepo.findByUserid(role).get());
	}
	@Transactional
	public ResponseEntity<List<AssignOffice>> assignroleoffice(AssignOffice role) {
		officerepo.deleteByUserid(role.getUserid());
		List<AssignOffice> bulkUpload=new ArrayList();
		for(int value:role.getOfficelist()) {
			AssignOffice sRole=new AssignOffice();
			sRole.setUserid(role.getUserid());
			sRole.setOfficeid(value);
			System.out.println(sRole);
			bulkUpload.add(sRole);
		}

		bulkUpload.parallelStream().forEach(e -> officerepo.save(e));
		return new ResponseEntity<>(bulkUpload,HttpStatus.OK);
	}
	
	public ResponseEntity<List<DefaultRoleModule>> getDefaultModule(int role){
		Optional<List<DefaultRoleModule>> moduleByRole=modulebyrolerepo.findByRoleid(role);
		if(moduleByRole.isPresent())
		return ResponseEntity.ok(moduleByRole.get())  ;
		else
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	public ResponseEntity<List<AssignOffice>> getOfficeByUser(int role){
		Optional<List<AssignOffice>> moduleByRole=officerepo.findByUserid(role);
		if(moduleByRole.isPresent())
		return ResponseEntity.ok(moduleByRole.get())  ;
		else
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	
	public ResponseEntity<Boolean> checkModuleByUserId(int userid,String path){
		
		Boolean i=roleRepo.checkModuleByuserid(userid,path);
		System.out.println("cast Value"+i);
		if(i) {
			return ResponseEntity.ok(false);
		}else {
			return ResponseEntity.ok(true);
		}
	}
	
	
}
