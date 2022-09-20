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
@Table(schema="public", name="ALMACEN")
public class Almacen {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_almacen;
	
	@NotNull
	@Column(name="nombre")
	private String nombre;
	
	@NotNull
	@Column(name="direccion")
	private String direccion;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipoAlmacen")
	private TipoAlmacen tipoAlmacen;
	
	@Transient
	@NotNull
	@Column(name="id_tipoAlmacen")
	private Integer id_tipoAlmacen;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Integer getId_tipoAlmacen() {
		return id_tipoAlmacen;
	}
	
	public void setId_tipoAlmacen(Integer id_tipoAlmacen) {
		this.id_tipoAlmacen = id_tipoAlmacen;
	}
}
