package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.Producto;
import com.ingeneo.logistica.repositories.ProductoRepo;

public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	public ProductoRepo productoRepo;
	
	@Override
	public List<Producto> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return productoRepo.findAll();
	}

}
