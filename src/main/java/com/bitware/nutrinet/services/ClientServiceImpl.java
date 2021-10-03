package com.bitware.nutrinet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bitware.nutrinet.models.Client;
import com.bitware.nutrinet.repository.IClientDao;

@Service
public class ClientServiceImpl implements IClientService {
	
	@Autowired
    private IClientDao clientDao;

	@Override
	@Transactional(readOnly = true)
	public List<Client> findAll() {
		return (List<Client>) clientDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Client findByID(int id) {
		Optional<Client> client = clientDao.findById(id);
		// TODO Auto-generated method stub
		return client.isPresent() ? client.get() : null;
	}

	@Override
	public Client save(Client client) {
		// TODO Auto-generated method stub
		return clientDao.save(client);
	}
}
