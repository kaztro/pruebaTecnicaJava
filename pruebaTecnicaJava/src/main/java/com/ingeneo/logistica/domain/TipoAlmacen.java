package com.ingeneo.logistica.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema="public", name="TIPO_DE_ALMACEN")
public class TipoAlmacen {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_tipoAlmacen;
	
	@NotNull
	@Column(name="tipoAlmacen")
	private String tipoAlmacen;
	
	public Integer getId_tipoAlmacen() {
		return id_tipoAlmacen;
	}
	
	public void getId_tipoAlmacen(Integer id_tipoAlmacen) {
		this.id_tipoAlmacen = id_tipoAlmacen;
	}
	
	public String getTipoAlmacen() {
		return tipoAlmacen;
	}
	
	public void setTipoAlmacen(String tipoAlmacen) {
		this.tipoAlmacen = tipoAlmacen;
	}
}
