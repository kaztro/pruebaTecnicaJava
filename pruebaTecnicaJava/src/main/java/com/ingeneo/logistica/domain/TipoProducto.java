package com.ingeneo.logistica.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema="public", name="TIPO_DE_PRODUCTO")
public class TipoProducto {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_tipoProducto;
	
	@Column(name="tipoProducto")
	@NotEmpty
	@NotNull
	private String tipoProducto;
	
	public Integer getId_tipoProducto() {
		return id_tipoProducto;
	}
	
	public void setId_tipoProducto(Integer id_tipoProducto) {
		this.id_tipoProducto = id_tipoProducto;
	}
	
	public String getTipoProducto() {
		return tipoProducto;
	}
	
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
}
