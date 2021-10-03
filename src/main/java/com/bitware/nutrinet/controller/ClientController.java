package com.bitware.nutrinet.controller;

import java.util.List;

import org.apache.catalina.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitware.nutrinet.models.Client;
import com.bitware.nutrinet.models.ReponseData;
import com.bitware.nutrinet.services.ClientServiceImpl;
import com.bitware.nutrinet.services.IClientService;

@RestController
@RequestMapping("/NutriNET")
public class ClientController {
	
	@Autowired
	private ClientServiceImpl clientService;

	
	@GetMapping("/cliente")
	public ReponseData getClients() {
		ReponseData response = new ReponseData<List<Client>>();
		response.setResult(clientService.findAll());
		return response;
	}
	
	@GetMapping("/cliente/{id}")
	public ReponseData getClients(@PathVariable String id) {
		ReponseData response;
		if (id == null) {
			response = new ReponseData();
			response.setCode("401");
			response.setDescription("Bad Request");
			
			return response;
		}
		
		int identifier=0;
		try {
			identifier = Integer.parseInt(id);
		} catch(NumberFormatException e) {
			e.printStackTrace();
			
			response = new ReponseData();
			response.setCode("500");
			response.setDescription(e.getMessage());
			return response;
		}
		
		response = new ReponseData<Client>();
		response.setResult(clientService.findByID(identifier));
		return response;
	}
	
	@PostMapping("/cliente")
	public ReponseData saveClient(@RequestBody Client client) {
		try {
			Client cl = clientService.save(client);
			
			ReponseData response = new ReponseData<Client>();
			response.setResult(cl);
			return response;
			
		} catch(Exception e) {
			ReponseData response = new ReponseData();
			response.setCode("500");
			response.setDescription(e.getMessage());
			return response;
		}
		
	}
	
	@PutMapping("/cliente/{id}")
	public Client saveClient(@PathVariable String id) {
		if (id == null)
			return null;
		return null;
	}

}
