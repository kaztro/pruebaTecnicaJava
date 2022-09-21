package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.CliPro;

public interface CliProService {
	public List<CliPro> findAll() throws DataAccessException;
}
