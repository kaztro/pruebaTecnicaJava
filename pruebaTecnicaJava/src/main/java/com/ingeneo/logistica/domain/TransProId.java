package com.ingeneo.logistica.domain;

import java.io.Serializable;
import java.util.Objects;

public class TransProId implements Serializable {
	private Integer id_transporte;
	private Integer id_producto;
	
	public TransProId() {
	}

	public TransProId(Integer id_transporte, Integer id_producto) {
		super();
		this.id_transporte = id_transporte;
		this.id_producto = id_producto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_producto, id_transporte);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransProId other = (TransProId) obj;
		return Objects.equals(id_producto, other.id_producto) && Objects.equals(id_transporte, other.id_transporte);
	}
	
	
	
}
