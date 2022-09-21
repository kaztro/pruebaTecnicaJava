package com.ingeneo.logistica.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="TRANSPORTE")
public class Transporte {
	
	@Id
	@Column(name="ID")
	private Integer id_transporte;
	
	@Column(name="placa")
	@Size(message="Como maximo puede ingresar solo 6 caracteres.", max=6)
	@Pattern(message="La placa debe estar compuesta por 3 letras iniciales y 3 números finales", 
		regexp = "^([A-Z]{3}[0-9]{3})\\z")
	private String placa;
	
	@Column(name="nFlota")
	@Size(message="Como maximo puede ingresar solo 8 caracteres.", max=8)
	@Pattern(message="La placa debe estar compuesta por 3 letras iniciales, 4 números y una letra al final", 
		regexp = "^([A-Z]{3}[0-9]{4}[A-Z]{1})\\z")
	private String nFlota;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipoTransporte")
	private TipoTransporte tipoTransporte;
	
	@Transient
	@NotNull
	@Column(name="id_tipoTransporte")
	private Integer id_tipoTransporte;
	
	public String getPlaca() {
		return placa;
	}
	
	public String getNFlota() {
		return nFlota;
	}
	
	public Integer getId_tipoTransporte( ) {
		return id_tipoTransporte;
	}
	/*
	public TipoTransporte getTipoTransporte() {
		return tipoTransporte;
	}*/
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setNFlota(String nFlota) {
		this.nFlota = nFlota;
	}
	
	public void setTipoTransporte(TipoTransporte tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}
	
	public void setId_tipoTransporte(Integer id_tipoTransporte) {
		this.id_tipoTransporte = id_tipoTransporte;
	}
	/*
	public TipoTransporte getTipoTransporte() {
		return tipoTransporte;
	}
	
	public void setTipoTransporte(TipoTransporte tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}
	*/
}
