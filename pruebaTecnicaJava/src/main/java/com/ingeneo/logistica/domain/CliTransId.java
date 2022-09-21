package com.ingeneo.logistica.domain;

import java.io.Serializable;
import java.util.Objects;

public class CliTransId implements Serializable {
	private Integer id_cliente;
	private Integer id_transporte;
		
	public CliTransId() {
	}

	public CliTransId(Integer id_cliente, Integer id_transporte) {
		this.id_cliente = id_cliente;
		this.id_transporte = id_transporte;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_cliente, id_transporte);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CliTransId other = (CliTransId) obj;
		return Objects.equals(id_cliente, other.id_cliente) && Objects.equals(id_transporte, other.id_transporte);
	}
	
	
	
}
