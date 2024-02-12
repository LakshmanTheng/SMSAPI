package com.smsApi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smsApi.entity.Clients;
import com.smsApi.entity.Company;
import com.smsApi.repository.ClientRepository;

import ch.qos.logback.core.net.server.Client;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

	@Autowired
    private ClientRepository clientRepository;
	

	 @PostMapping("/saveclient")
		public Clients saveData(@RequestBody Clients client) {
			clientRepository.save(client);
			return client;
		}
	 
	//Handler for each a single record
	 @GetMapping("/getclient/{id}")
	 public Clients getClientData(@PathVariable Long id) {
		 Optional<Clients> client= clientRepository.findById(id);
	 	Clients client1=client.get();
	 	return client1;
	 	
	 }
	 
	//Handler for fetch all data from DB
		@GetMapping("/getAllClients")
		public List<Clients> getAll(){
			List<Clients> clientList= clientRepository.findAll();	
			return clientList;
		}
		
		// Handler for delete a perticular task from DB
		@DeleteMapping("/deleteclient/{id}")
		public String deleteClient(@PathVariable Long id) {
		 Clients client =clientRepository.findById(id).get();
			if(client!=null)
	clientRepository.delete(client);
			return "Delete Successfully!!";
			
		}
		// handler for update a perticular task fron db
		@PutMapping("/updateData")
		public Clients updateCompany(@RequestBody Clients client) {
			clientRepository.save(client);
			return client;
			
		}

}
