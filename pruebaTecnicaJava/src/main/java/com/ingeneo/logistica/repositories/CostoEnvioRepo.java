package com.ingeneo.logistica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingeneo.logistica.domain.CostoEnvio;

public interface CostoEnvioRepo extends JpaRepository<CostoEnvio, Integer> {
    
}
