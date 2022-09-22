package com.ingeneo.logistica.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ingeneo.logistica.domain.CostoEnvio;

public interface CostoEnvioService {
    public List<CostoEnvio> findAll() throws DataAccessException;
}
