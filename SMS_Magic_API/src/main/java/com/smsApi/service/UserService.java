package com.smsApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smsApi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
    private UserRepository userRepository;
    
    // Implement service methods
	
	
}
