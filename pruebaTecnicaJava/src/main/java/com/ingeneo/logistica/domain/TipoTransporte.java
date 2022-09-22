package com.ingeneo.logistica.domain;

import javax.persistence.Transient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipoAlmacen")
	private CostoEnvio costoEnvio;

	@Transient
	@NotNull
	@Column(name="id_costoEnvio")
	private Integer id_costoEnvio;

	public Integer getId_costoEnvio() {
		return id_costoEnvio;
	}

	public void setId_costoEnvio(Integer id_costoEnvio) {
		this.id_costoEnvio = id_costoEnvio;
	}

	public CostoEnvio getCostoEnvio() {
		return costoEnvio;
	}

	public void setCostoEnvio(CostoEnvio costoEnvio) {
		this.costoEnvio = costoEnvio;
	}
	
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
