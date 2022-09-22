package com.ingeneo.logistica.repositories;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ingeneo.logistica.domain.Transporte;

public interface TransporteRepo extends JpaRepository<Transporte, Integer> {

    @Query(nativeQuery=true, value="Select * from public.transporte where placa = ?1")
    public List<Transporte> findByPlaca(String placa) throws DataAccessException;

    @Query(nativeQuery=true, value="Select * from public.transporte where nFlota = ?1")
    public List<Transporte> findByFlota(String nFlota) throws DataAccessException;

}
