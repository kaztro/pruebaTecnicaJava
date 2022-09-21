package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.TipoProducto;

public interface TipoProductoService {
	public List<TipoProducto> findAll() throws DataAccessException;

}
