package com.ingeneo.logistica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingeneo.logistica.domain.Almacen;

public interface AlmacenRepo extends JpaRepository<Almacen, Integer> {
	
}
