package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.TransPro;

public interface TransProService {
	public List<TransPro> findAll() throws DataAccessException;

}
