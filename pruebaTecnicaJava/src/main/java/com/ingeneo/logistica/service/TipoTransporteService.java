package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.TipoTransporte;

public interface TipoTransporteService {
	public List<TipoTransporte> findAll() throws DataAccessException;

}
