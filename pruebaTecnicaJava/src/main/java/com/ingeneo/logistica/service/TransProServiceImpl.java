package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.TransPro;
import com.ingeneo.logistica.repositories.TransProRepo;

public class TransProServiceImpl implements TransProService {
	
	@Autowired
	public TransProRepo transProRepo;
	
	@Override
	public List<TransPro> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return transProRepo.findAll();
	}

}
