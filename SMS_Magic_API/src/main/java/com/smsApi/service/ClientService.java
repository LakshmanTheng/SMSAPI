package com.smsApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smsApi.repository.ClientRepository;

@Service
public class ClientService {

	
	 @Autowired
	    private ClientRepository clientRepository;
	    
	    // Implement service methods
}
