package com.fna.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fna.model.BalanceSheetGroup;
import com.fna.model.Group;
import com.fna.repository.BalanceSheetGroupRepository;
import com.fna.repository.GroupRepository;


@Service
public class GroupService {
	
@Autowired
private GroupRepository grouprepository; 
@Autowired
private BalanceSheetGroupRepository balancesheetgrouprepository; 
	
	public ResponseEntity<Group> saveGroup(Group group) {		
		try {
			grouprepository.save(group);
			return new ResponseEntity<>(group, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<List<Group>> getGroups() {
	   try 
	   {
		List<Group> group = new ArrayList<Group>();        
        grouprepository.getAllGroups().forEach(group::add);
        if(group.isEmpty())
        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
        }
        return new ResponseEntity<>(group,HttpStatus.OK);
	   }
	   catch (Exception e) {
		   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }
	
	public ResponseEntity<Group> getGroupById(int groupid) {
		Optional<Group> groupData = grouprepository.findById(groupid);
		if (groupData.isPresent()) {
			return new ResponseEntity<>(groupData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	    }
	
	public ResponseEntity<Group> updateGroup(int groupid,Group group) {
		Optional<Group> existingGroup = grouprepository.findById(groupid);
		if (existingGroup.isPresent()) {
			Group _group = existingGroup.get();
			_group.setGroupcode(group.getGroupcode());
			_group.setGroupname(group.getGroupname());
			_group.setGroupdescription(group.getGroupdescription());
			_group.setBalancesheetgroupid(group.getBalancesheetgroupid());
			_group.setIsactive(group.isIsactive());		
			return new ResponseEntity<>(grouprepository.save(_group), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	
    }
	
	public ResponseEntity<List<BalanceSheetGroup>> getBalanceSheetGroups() {
		   try 
		   {
			List<BalanceSheetGroup> group = new ArrayList<BalanceSheetGroup>();        
			balancesheetgrouprepository.findAll().forEach(group::add);
	        if(group.isEmpty())
	        {  return new ResponseEntity<>(HttpStatus.NO_CONTENT);        	
	        }
	        return new ResponseEntity<>(group,HttpStatus.OK);
		   }
		   catch (Exception e) {
			   return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    }

	public Boolean checkUnique(int id,String name) {
   return grouprepository.checkUnique("checkifuniquegroupname", id, name);
	}
	

}
