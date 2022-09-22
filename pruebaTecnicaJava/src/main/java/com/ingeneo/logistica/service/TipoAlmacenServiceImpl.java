package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.ingeneo.logistica.domain.TipoAlmacen;
import com.ingeneo.logistica.repositories.TipoAlmacenRepo;

@Service
public class TipoAlmacenServiceImpl implements TipoAlmacenService {
	//Implementación del servicio
	@Autowired
	public TipoAlmacenRepo tipoAlmacenRepo;
	
	@Override
	public List<TipoAlmacen> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return tipoAlmacenRepo.findAll();
	}

}
