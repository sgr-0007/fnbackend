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

import com.fna.model.User ;
import com.fna.model.UserDetails;
import com.fna.model.UserModuleCheckDetails;
import com.fna.model.UserRoleMappingView;
import com.fna.model.UserRoleOfficeDetails;
import com.fna.service.UserService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")


public class UserController {
	@Autowired
	private UserService userservice;
	
	@PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return userservice.saveUser(user); 
    }
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> findUsers() {     
		return userservice.getUsers();
	    }
	@GetMapping("/userslist")
	public ResponseEntity<List<UserDetails>> findUsersList() {     
		return userservice.getUsersList();
	    }
	
	
	@GetMapping("/users/{id}")
    public ResponseEntity<User> findUserById(@PathVariable(value = "id") int userid) {     
	return userservice.getUserById(userid);
    }

    @PutMapping("/user/{id}")
   public ResponseEntity<User> updateUser(@PathVariable(value = "id") int userid,
	         @RequestBody User user) {    	
       return userservice.UpdateUser(userid,user);
   }
    
    @GetMapping("/user/employee/{employeeid}")
    public boolean checknameexist(@PathVariable String employeeid) {
    	
    	return userservice.checkUserName(employeeid);
    }
    @GetMapping("/checkunameuniqueonedit")
    public Boolean checkUniqueUserName(@RequestParam("id") int id ,
            @RequestParam("name") String name ) {     
    	return userservice.checkUniqueUserName(id,name);
	 
    }
    @GetMapping("/checkeiduniqueonedit")
    public Boolean checkUniqueEid(@RequestParam("id") int id ,
            @RequestParam("empid") String empid )
    {     
    	return userservice.checkUniqueEid(id,empid);
	 
    }
    @GetMapping("/usermodulecheck/{id}")
    public ResponseEntity<List<UserModuleCheckDetails>> userModuleCheck(@PathVariable(value = "id") int userid)
    {     
    	return userservice.userModuleCheck(userid);
	 
    }
    
    @GetMapping("/userrolecheck/{id}/{moduleid}")
    public ResponseEntity<UserRoleMappingView> findRoleByUId(@PathVariable(value = "id") int userid,@PathVariable(value = "moduleid") int moduleid) {     
	return userservice.userRoleCheck(userid,moduleid);
    }
    
    
    @GetMapping("/user/role/office/{userid}")
    public ResponseEntity<UserRoleOfficeDetails>  getUserRoleOfficeDetails(@PathVariable(value="userid") int userid){
    	return userservice.userRoleOfficeDetails(userid);
    }
    
    
   @GetMapping("/checkuniquemobilenumber/{mobileNumber}")
   public Boolean checkMobileNumber(@PathVariable String mobileNumber){
	   return userservice.checkMobileNumber(mobileNumber);
   }
    


}
