package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.Almacen;

public interface AlmacenService {
	
	public List<Almacen> findAll() throws DataAccessException;

}
