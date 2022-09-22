package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.ingeneo.logistica.domain.Transporte;
import com.ingeneo.logistica.repositories.TransporteRepo;

@Service
public class TransporteServiceImpl implements TransporteService {
	//Implementación del servicio
	@Autowired
	public TransporteRepo transporteRepo;
	
	@Override
	public List<Transporte> findAll() throws DataAccessException {
		return transporteRepo.findAll();
	}

}