package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.TransAl;
import com.ingeneo.logistica.repositories.TransAlRepo;

public class TransAlServiceImpl implements TransAlService {
	
	@Autowired
	public TransAlRepo transAlRepo;
	
	@Override
	public List<TransAl> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return transAlRepo.findAll();
	}

}
