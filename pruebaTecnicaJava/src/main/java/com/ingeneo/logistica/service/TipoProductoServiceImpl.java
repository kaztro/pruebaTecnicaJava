package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.TipoProducto;
import com.ingeneo.logistica.repositories.TipoProductoRepo;

public class TipoProductoServiceImpl implements TipoProductoService {
	
	@Autowired
	public TipoProductoRepo tipoProductoRepo;
	
	@Override
	public List<TipoProducto> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return tipoProductoRepo.findAll();
	}

}
