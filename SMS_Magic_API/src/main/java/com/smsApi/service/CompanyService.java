package com.smsApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smsApi.repository.CompanyRepository;

@Service
public class CompanyService {

	
	 @Autowired
	    private CompanyRepository companyRepository;
	    
	    // Implement service methods
}
