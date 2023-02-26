package com.springbootangular.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootangular.backend.model.User;
import com.springbootangular.backend.repository.UserRepository;

@RestController
@RequestMapping("/secure/test")
public class AdminController {
	
	@Autowired
	private UserRepository userRepository;
	
	/*
	 * @Autowired private BCryptPasswordEncoder passwordEncoder;
	 */
	
	
	@PostMapping
	public String addUserByAdmin(@RequestBody User user) {
		userRepository.save(user);
		return "User added successfully...";
	}

}
