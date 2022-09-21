package com.ingeneo.logistica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingeneo.logistica.domain.TipoProducto;

public interface TipoProductoRepo extends JpaRepository<TipoProducto, Integer> {

}
