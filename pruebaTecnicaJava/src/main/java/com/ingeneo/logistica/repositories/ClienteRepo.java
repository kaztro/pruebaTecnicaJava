package com.ingeneo.logistica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingeneo.logistica.domain.Cliente;

public interface ClienteRepo extends JpaRepository<Cliente, Integer>{

}
