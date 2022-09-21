package com.ingeneo.logistica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingeneo.logistica.domain.Producto;

public interface ProductoRepo extends JpaRepository<Producto, Integer> {

}
