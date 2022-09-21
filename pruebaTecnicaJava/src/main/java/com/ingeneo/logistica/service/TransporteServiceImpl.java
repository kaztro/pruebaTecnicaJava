package com.ingeneo.logistica.service;

import java.util.List;

import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;

import com.ingeneo.logistica.domain.Transporte;
import com.ingeneo.logistica.repositories.TransporteRepo;

public class TransporteServiceImpl implements TransporteService {
	@Autowired
	public TransporteRepo transporteRepo;
	
	@Override
	public List<Transporte> findAll() throws DataException {
		return TransporteRepo.findAll()
	}

}