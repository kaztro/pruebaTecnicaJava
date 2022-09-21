package com.ingeneo.logistica.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@IdClass(TransAlId.class)
@Table(schema = "public", name = "TRANSPORTEXALMACEN")
public class TransAl {
	@Id
	@Column(name = "id_transporte")
	private Integer id_transporte;
	
	@Id
	@Column(name = "id_almacen")
	private Integer id_almacen;
	
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "fEntrega")
	private Date fEntrega;
	
	@NotNull
	@Column(name = "nGuia")
	@Size(message="Debe ingresar un código de 10 caracteres.", max=10, min=10)
	@Pattern(message="El número guía es alfanumerico de solo 10 caracteres", 
		regexp = " ^[a-zA-Z0-9]*$")
	private String nGuia;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_transporte", insertable=false, updatable=false)
	private Transporte transporte;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_almacen", insertable=false, updatable=false)
	private Almacen almacen;

	public Integer getId_transporte() {
		return id_transporte;
	}

	public void setId_transporte(Integer id_transporte) {
		this.id_transporte = id_transporte;
	}

	public Integer getId_almacen() {
		return id_almacen;
	}

	public void setId_almacen(Integer id_almacen) {
		this.id_almacen = id_almacen;
	}

	public Date getfEntrega() {
		return fEntrega;
	}

	public void setfEntrega(Date fEntrega) {
		this.fEntrega = fEntrega;
	}

	public String getnGuia() {
		return nGuia;
	}

	public void setnGuia(String nGuia) {
		this.nGuia = nGuia;
	}

	public Transporte getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	
	
	
}
