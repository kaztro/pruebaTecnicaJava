package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.Cliente;

public interface ClienteService {
	
	public List<Cliente> findAll() throws DataAccessException;
	
}
