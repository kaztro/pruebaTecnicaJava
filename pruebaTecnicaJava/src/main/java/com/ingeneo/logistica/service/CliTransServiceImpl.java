package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.CliTrans;
import com.ingeneo.logistica.repositories.CliTransRepo;

public class CliTransServiceImpl implements CliTransService {
	
	@Autowired
	public CliTransRepo cliTransRepo;
	
	@Override
	public List<CliTrans> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return cliTransRepo.findAll();
	}

}
