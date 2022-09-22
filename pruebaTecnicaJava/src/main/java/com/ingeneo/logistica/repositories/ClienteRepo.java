package com.ingeneo.logistica.repositories;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ingeneo.logistica.domain.Cliente;
import com.ingeneo.logistica.domain.Producto;

public interface ClienteRepo extends JpaRepository<Cliente, Integer> {
	
	@Query(nativeQuery=true, value="Select * from public.cliente where nombres = ?1")
	public List<Cliente> findByName(String name) throws DataAccessException;

	@Query(nativeQuery=true, value="Select * from public.cliente where apellidos = ?1")
	public List<Cliente> findByLastName(String lastName) throws DataAccessException;

	@Query(nativeQuery=true, value="Select ct.fRegistro from public.cliente as c, public.clientextransporte as ct where ct.id_cliente = ?1")
	public String fechaRegistro(Integer id) throws DataAccessException;

	@Query(nativeQuery=true, value="Select p.name from public.cliente as c INNER JOIN public.clientexproducto as cp, public.producto as p where cp.id_cliente = ?1")
	public List<Producto> getProductos(Integer id) throws DataAccessException;

}
