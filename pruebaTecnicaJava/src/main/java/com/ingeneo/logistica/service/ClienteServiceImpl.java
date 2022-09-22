package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.ingeneo.logistica.domain.Cliente;
import com.ingeneo.logistica.repositories.ClienteRepo;

@Service
public class ClienteServiceImpl implements ClienteService {
	//Implementación del servicio
	@Autowired
	public ClienteRepo clienteRepo;
	
	@Override
	public List<Cliente> findAll() throws DataAccessException {
		
		return clienteRepo.findAll();
	}

}
