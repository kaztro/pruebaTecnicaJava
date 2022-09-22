package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.ingeneo.logistica.domain.Telefono;
import com.ingeneo.logistica.repositories.TelefonoRepo;

@Service
public class TelefonoServiceImpl implements TelefonoService {
	//Implementación del servicio
	@Autowired
	public TelefonoRepo telefonoRepo;
	
	@Override
	public List<Telefono> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return telefonoRepo.findAll();
	}

}
