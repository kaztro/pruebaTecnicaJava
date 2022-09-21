package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.Almacen;
import com.ingeneo.logistica.repositories.AlmacenRepo;

public class AlmacenServiceImpl implements AlmacenService {
	
	@Autowired
	public AlmacenRepo almacenRepo;
	
	@Override
	public List<Almacen> findAll() throws DataAccessException {
		
		return almacenRepo.findAll();
	}

}
