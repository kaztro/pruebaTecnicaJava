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

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@IdClass(CliTransId.class)
@Table(schema = "public", name = "CLIENTEXTRANSPORTE")
public class CliTrans {
	
	@Id
	@Column (name = "id_cliente")
	private Integer id_cliente;
	
	@Id
	@Column (name = "id_transporte")
	private Integer id_transporte;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "fRegistro")
	private Date fRegistro;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_transporte")
	private Transporte transporte;
	
	public CliTrans() {
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Integer getId_transporte() {
		return id_transporte;
	}

	public void setId_transporte(Integer id_transporte) {
		this.id_transporte = id_transporte;
	}

	public Date getfRegistro() {
		return fRegistro;
	}

	public void setfRegistro(Date fRegistro) {
		this.fRegistro = fRegistro;
	}
	
	
}
