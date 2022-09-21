package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.TransAl;

public interface TransAlService {
	public List<TransAl> findAll() throws DataAccessException;

}
