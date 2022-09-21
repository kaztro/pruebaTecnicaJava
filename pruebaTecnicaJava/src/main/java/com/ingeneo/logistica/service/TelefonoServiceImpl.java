package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.Telefono;
import com.ingeneo.logistica.repositories.TelefonoRepo;

public class TelefonoServiceImpl implements TelefonoService {
	
	@Autowired
	public TelefonoRepo telefonoRepo;
	
	@Override
	public List<Telefono> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return telefonoRepo.findAll();
	}

}
