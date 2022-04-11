package com.examly.springapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	@Autowired
	private UserRepository userRepo;
	@PostMapping("/user/signup")
	public void add(@RequestBody User user) {
		user.setUserRole("user");
		userRepo.save(user);
	}
	@GetMapping("users")
	public List<User> getAllUsers(){
		
		return userRepo.findAll();
	}
	
}
