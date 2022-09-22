package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.ingeneo.logistica.domain.CliPro;
import com.ingeneo.logistica.repositories.CliProRepo;

@Service
public class CliProServiceImpl implements CliProService {
	//Implementación del servicio
	@Autowired
	public CliProRepo cliProRepo;
	
	@Override
	public List<CliPro> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return cliProRepo.findAll();
	}

}
