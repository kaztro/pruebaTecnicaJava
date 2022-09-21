package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.digitalatmosphere.ausys.domains.Rol;
import com.ingeneo.logistica.repositories.TransAlRepo;

public class TransProServiceImpl implements TransProService {
	@Autowired
	public TransAlRepo transProRpo;
	
	@Override
	public List<TransPro> findALL() throws DataAccessException {
		
		return transProRpo.findAll();
	}
}
