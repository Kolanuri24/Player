package com.example.Registration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Registration.Entity.User;
import com.example.Registration.Repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepository repo;
	public User saveUser(User user) {
		return repo.save(user);
	
	}
	public User fetchUserByUsername(String username) {
		return repo.findByUsername(username);
	}
	public User fetchUserByUsernameAndPassword(String username,String password) {
		return repo.findByUsernameAndPassword(username,password);
	}

}
