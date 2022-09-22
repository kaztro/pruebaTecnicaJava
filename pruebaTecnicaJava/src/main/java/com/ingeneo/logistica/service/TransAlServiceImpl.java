package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.ingeneo.logistica.domain.TransAl;
import com.ingeneo.logistica.repositories.TransAlRepo;

@Service
public class TransAlServiceImpl implements TransAlService {
	//Implementación del servicio
	@Autowired
	public TransAlRepo transAlRepo;
	
	@Override
	public List<TransAl> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return transAlRepo.findAll();
	}

}
