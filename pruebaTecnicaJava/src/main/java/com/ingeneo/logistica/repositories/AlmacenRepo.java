package com.ingeneo.logistica.repositories;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ingeneo.logistica.domain.Almacen;

public interface AlmacenRepo extends JpaRepository<Almacen, Integer> {
	
    @Query(nativeQuery=true, value="Select * from public.almacen where nombre = ?1")
    public List<Almacen> findByName(String name) throws DataAccessException;

}
