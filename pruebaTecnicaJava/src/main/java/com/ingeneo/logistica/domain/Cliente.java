package com.ingeneo.logistica.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema="public", name="CLIENTE")
public class Cliente {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cliente;
	
	@NotNull
	@Column(name="nombres")
	private String nombres;
	
	@NotNull
	@Column(name="apellidos")
	private String apellidos;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_telefono")
	private Telefono telefono;
	
	@Transient
	@NotNull
	@Column(name="id_telefono")
	private Integer id_telefono;
	
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public Integer getId_telefono() {
		return id_telefono;
	}
	
	public void setId_telefono(Integer id_telefono) {
		this.id_telefono = id_telefono;
	}
	
}
