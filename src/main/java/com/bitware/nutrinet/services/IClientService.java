package com.bitware.nutrinet.services;

import java.util.List;

import com.bitware.nutrinet.models.Client;

public interface IClientService {
	
	public List<Client> findAll();
	
	public Client findByID(int id);
	
	public Client save(Client client);
	

	

}
