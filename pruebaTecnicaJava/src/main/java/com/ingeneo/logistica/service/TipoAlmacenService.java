package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.TipoAlmacen;

public interface TipoAlmacenService {
	public List<TipoAlmacen> findAll() throws DataAccessException;

}
