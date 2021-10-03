package com.bitware.nutrinet.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.bitware.nutrinet.models.Client;

@Repository
public interface IClientDao extends CrudRepository<Client, Integer> {
	

}
