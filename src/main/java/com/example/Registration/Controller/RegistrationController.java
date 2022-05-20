package com.example.Registration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Registration.Entity.User;
import com.example.Registration.Service.RegistrationService;

@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	@PostMapping("/registrationuser")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempUsername=user.getUsername();
		if(tempUsername!=null && !"".equals(tempUsername)) {
			User userObj=service.fetchUserByUsername(tempUsername);
			if(userObj!=null) {
				throw new Exception("user with "+tempUsername+" is already exist");
			}
		}
	    User userObj=null;
		userObj=service.saveUser(user);
		return userObj;
	}
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempUsername=user.getUsername();
		String tempPass=user.getPassword();
		User userObj=null;
		if(tempUsername !=null && tempPass !=null) {
			service.fetchUserByUsernameAndPassword(tempUsername, tempPass);
			
		}
		if(userObj == null) {
			throw new Exception("Bad creadentials");
		}
		return userObj;
	}

}

