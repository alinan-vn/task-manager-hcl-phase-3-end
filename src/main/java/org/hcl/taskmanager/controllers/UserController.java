package org.hcl.taskmanager.controllers;

import org.hcl.taskmanager.crudRepository.UserCrudRepository;
import org.hcl.taskmanager.entities.UserEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {

	@Autowired 
	UserCrudRepository userCrudRepository;
	
	@GetMapping("/users")
	public Iterable<UserEntity> getAllUsers(){
		return userCrudRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public UserEntity getUser(@PathVariable Long id) {
		return userCrudRepository.findById(id).get();
	}
	
	@PostMapping("/user")
	public UserEntity createUser(@RequestBody UserEntity user) {
		return userCrudRepository.save(user);
	}
	
}
