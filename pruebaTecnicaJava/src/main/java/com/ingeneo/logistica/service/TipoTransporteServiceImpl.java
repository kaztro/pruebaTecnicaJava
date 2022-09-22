package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.ingeneo.logistica.domain.TipoTransporte;
import com.ingeneo.logistica.repositories.TipoTransporteRepo;

@Service
public class TipoTransporteServiceImpl implements TipoTransporteService {
	//Implementación del servicio
	@Autowired
	public TipoTransporteRepo tipoTransporteRepo;
	
	@Override
	public List<TipoTransporte> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return tipoTransporteRepo.findAll();
	}

}
