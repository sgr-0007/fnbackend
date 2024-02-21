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

import com.fna.model.BalanceSheetGroup;
import com.fna.model.Group;
import com.fna.service.GroupService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class GroupController {
	
	@Autowired
	private GroupService groupservice;
	
	@PostMapping("/groups")
    public ResponseEntity<Group> addGroup(@RequestBody Group group) {
        return groupservice.saveGroup(group); 
    } 
	
	@GetMapping("/groups")
    public ResponseEntity<List<Group>> findAllGroups() {     
	return groupservice.getGroups();
    }
	
	@GetMapping("/groups/{id}")
    public ResponseEntity<Group> findGroupById(@PathVariable(value = "id") int groupid) {     
	return groupservice.getGroupById(groupid);
    }

    @PutMapping("/groups/{id}")
   public ResponseEntity<Group> updateGroup(@PathVariable(value = "id") int groupid,
	         @RequestBody Group group) {    	
       return groupservice.updateGroup(groupid,group);
   }
    @GetMapping("/balancesheetgroups")
    public ResponseEntity<List<BalanceSheetGroup>> findAllBalanceSheetGroups() {     
	var bs = groupservice.getBalanceSheetGroups();
	return bs;
    }
    @GetMapping("/checkgroupuniqueonedit")
    public Boolean checkUnique(@RequestParam("id") int id ,
            @RequestParam("name") String name ) {     
	var bs = groupservice.checkUnique(id,name);
	return bs;
    }
	
}
