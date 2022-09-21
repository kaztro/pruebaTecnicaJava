package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.Telefono;

public interface TelefonoService {
	public List<Telefono> findAll() throws DataAccessException;

}
