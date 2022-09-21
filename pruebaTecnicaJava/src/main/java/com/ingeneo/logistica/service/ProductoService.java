package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.Producto;

public interface ProductoService {
	public List<Producto> findAll() throws DataAccessException;

}
