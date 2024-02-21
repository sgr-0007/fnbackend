package com.fna.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.Subgroup;
import com.fna.repository.SubgroupRepository;

@Service
public class SubgroupService {
	
	@Autowired
	private SubgroupRepository subgrouprepository;
	
	public ResponseEntity<Subgroup> saveSubgroup(Subgroup subgroup) {		
		try {
			subgrouprepository.save(subgroup);
			return new ResponseEntity<>(subgroup, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<Subgroup>> getSubgroup() {
	   try 
	   {
		List<Subgroup> subgroup = new ArrayList<Subgroup>();        
		subgrouprepository.findAll().forEach(subgroup::add);
        if(subgroup.isEmpty())
        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
        }
        return new ResponseEntity<>(subgroup,HttpStatus.OK);
	   }
	   catch (Exception e) {
		   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
	
	public ResponseEntity<List<Subgroup>> getSubgroupnative() {
		   try 
		   {
			List<Subgroup> subgroup = new ArrayList<Subgroup>();        
			subgrouprepository.SubGroupNative().forEach(subgroup::add);
	        if(subgroup.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(subgroup,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }
	
	public ResponseEntity<Subgroup> getSubgroupById(int subgroupid) {
		Optional<Subgroup> subgroupData = subgrouprepository.findById(subgroupid);
		if (subgroupData.isPresent()) {
			return new ResponseEntity<>(subgroupData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	    }
	
	public ResponseEntity<Subgroup> updateSubgroup(int subgroupid,Subgroup subgroup) {
		Optional<Subgroup> existingSubgroup = subgrouprepository.findById(subgroupid);
		if (existingSubgroup.isPresent()) {
			Subgroup _subgroup = existingSubgroup.get();
			_subgroup.setSubgroupcode(subgroup.getSubgroupcode());
			_subgroup.setSubgroupname(subgroup.getSubgroupname());
			_subgroup.setSubgroupdescription(subgroup.getSubgroupdescription());
			_subgroup.setGroupid(subgroup.getGroupid());
			_subgroup.setIsactive(subgroup.isIsactive());		
			return new ResponseEntity<>(subgrouprepository.save(_subgroup), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	
    }
	
	public Boolean checkUnique(int id,String name) {
		   return subgrouprepository.checkUnique("checkifuniquesubgroupname", id, name);
			}


}
