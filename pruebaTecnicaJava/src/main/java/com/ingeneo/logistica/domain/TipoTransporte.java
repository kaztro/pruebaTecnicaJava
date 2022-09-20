package com.ingeneo.logistica.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(schema="public", name="TIPO_DE_TRANSPORTE")
public class TipoTransporte {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_tipoTransporte;
	
	@Column(name="tipoTransporte")
	@NotEmpty
	private String tipoTransporte;
	
	public Integer getId_tipoTransporte() {
		return id_tipoTransporte;
	}
	
	public void setId_tipoTransporte(Integer id_tipoTrasnporte) {
		this.id_tipoTransporte = id_tipoTrasnporte;
	}
	
	public String getTipoTransporte() {
		return tipoTransporte;
	}
	
	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}
	
}
