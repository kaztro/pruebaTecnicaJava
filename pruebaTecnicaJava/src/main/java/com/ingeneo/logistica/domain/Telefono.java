package com.ingeneo.logistica.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="TELEFONO")
public class Telefono {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_telefono;
	
	@Column(name="telefono")
	private String telefono;
	
	public Integer getId_telefono() {
		return id_telefono;
	}
	
	public void setId_telefono(Integer id_telefono) {
		this.id_telefono = id_telefono;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
