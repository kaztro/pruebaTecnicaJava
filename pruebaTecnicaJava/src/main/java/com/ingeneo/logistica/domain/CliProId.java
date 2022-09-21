package com.ingeneo.logistica.domain;

import java.io.Serializable;
import java.util.Objects;

public class CliProId implements Serializable{
	private Integer id_cliente;
	private Integer id_producto;
	
	public CliProId() {
		
	}

	public CliProId(Integer id_cliente, Integer id_producto) {
		this.id_cliente = id_cliente;
		this.id_producto = id_producto;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id_cliente, id_producto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CliProId other = (CliProId) obj;
		return Objects.equals(id_cliente, other.id_cliente) && Objects.equals(id_producto, other.id_producto);
	}
	
}
