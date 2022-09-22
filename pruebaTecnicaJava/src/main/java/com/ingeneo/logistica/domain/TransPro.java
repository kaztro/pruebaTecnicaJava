package com.ingeneo.logistica.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@IdClass(TransProId.class)
@Table(schema = "public", name = "TRANSPORTEXPRODUCTO")
public class TransPro {
	
	@Id
	@Column(name = "id_transporte")
	private Integer id_transporte;
	
	@Id
	@Column(name = "id_producto")
	private Integer id_producto;
	
	@NotNull
	@Column(name = "precio")
	private Float precio;
	
	@NotNull
	@Column(name = "descuento")
	private Float descuento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_transporte", insertable=false, updatable=false)
	private Transporte transporte;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_producto", insertable=false, updatable=false)
	private Producto producto;

	public Integer getId_transporte() {
		return id_transporte;
	}

	public void setId_transporte(Integer id_transporte) {
		this.id_transporte = id_transporte;
	}

	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Transporte getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
