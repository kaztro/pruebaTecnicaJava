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
@Table(schema="public", name="PRODUCTO")
public class Producto {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_producto;
	
	@NotNull
	@Column(name="nombre")
	private String nombre;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipoProducto")
	private TipoProducto tipoProducto;
	
	@Transient
	@NotNull
	@Column(name="id_tipoProducto")
	private Integer id_tipoProducto;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getId_tipoProducto() {
		return id_tipoProducto;
	}
	
	public void setId_tipoProducto(Integer id_tipoProducto) {
		this.id_tipoProducto = id_tipoProducto;
	}
}
