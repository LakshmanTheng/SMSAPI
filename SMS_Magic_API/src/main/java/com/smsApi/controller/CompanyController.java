package com.smsApi.controller;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smsApi.entity.Company;
import com.smsApi.entity.Users;
import com.smsApi.repository.CompanyRepository;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

	 @Autowired
	    private CompanyRepository companyRepository;
	    
	    // Implement CRUD endpoints
	 

	 @PostMapping("/savecompany")
		public Company saveData(@RequestBody Company company) {
			
			companyRepository.save(company);
			return company;
		}
	 
	//Handler for each a single record
	 @GetMapping("/getcompany/{id}")
	 public Company getCompanyData(@PathVariable Long id) {
		 java.util.Optional<Company> company= companyRepository.findById(id);
	 	Company company1=company.get();
	 	return company1;
	 	
	 }
	 
	//Handler for fetch all data from DB
		@GetMapping("/getAllCompany")
		public List<Company> getAll(){
			List<Company> companyList= companyRepository.findAll();	
			return companyList;
		}
		
		// Handler for delete a perticular task from DB
		@DeleteMapping("/deleteCompany/{id}")
		public String deleteCompany(@PathVariable Long id) {
		 Company company =companyRepository.findById(id).get();
			if(company!=null)
			companyRepository.delete(company);
			return "Delete Successfully!!";
			
		}
		// handler for update a perticular task fron db
		@PutMapping("/updateData")
		public Company updateCompany(@RequestBody Company company) {
			companyRepository.save(company);
			return company;
			
		}
}
