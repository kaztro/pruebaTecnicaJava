package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.CliTrans;

public interface CliTransService {
	public List<CliTrans> findAll() throws DataAccessException;
}
