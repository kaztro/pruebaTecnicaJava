package com.ingeneo.logistica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingeneo.logistica.domain.CliTrans;

public interface CliTransRepo extends JpaRepository<CliTrans, Integer> {
   
}
