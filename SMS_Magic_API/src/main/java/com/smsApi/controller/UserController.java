package com.smsApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smsApi.entity.Users;
import com.smsApi.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

	 @Autowired
	    private UserRepository userRepository;
	    
	    // Implement CRUD endpoints
	 
	 @PostMapping("/saveusers")
		public Users saveData(@RequestBody Users user) {
			
			userRepository.save(user);
			return user;
		}
	 
	//Handler for each a single record
	 @GetMapping("/getuser/{id}")
	 public Users getUserData(@PathVariable Long id) {
	 	java.util.Optional<Users> user= userRepository.findById(id);
	 	Users user1=user.get();
	 	return user1;
	 	
	 }
	 
	//Handler for fetch all data from DB
		@GetMapping("/getAllUser")
		public List<Users> getAll(){
			List<Users> userList= userRepository.findAll();	
			return userList;
		}
		
		// Handler for delete a perticular task from DB
		@DeleteMapping("/deleteUsers/{id}")
		public String deleteUsers(@PathVariable Long id) {
			Users user =userRepository.findById(id).get();
			if(user!=null)
			userRepository.delete(user);
			return "Delete Successfully!!";
			
		}
		// handler for update a perticular task fron db
		@PutMapping("/updateData")
		public Users updateUsers(@RequestBody Users user) {
			userRepository.save(user);
			return user;
			
		}
}
