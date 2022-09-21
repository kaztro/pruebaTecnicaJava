package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.Transporte;

public interface TransporteService {
	public List<Transporte> findAll() throws DataAccessException;

}
