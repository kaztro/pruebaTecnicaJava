package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.ingeneo.logistica.domain.CostoEnvio;
import com.ingeneo.logistica.repositories.CostoEnvioRepo;

@Service
public class CostoEnvioServiceImpl implements CostoEnvioService {
    //Implementación del servicio
    @Autowired
    public CostoEnvioRepo costoEnvioRepo;

    @Override
    public List<CostoEnvio> findAll() throws DataAccessException {
        // TODO Auto-generated method stub
        return costoEnvioRepo.findAll();
    }
    
}
