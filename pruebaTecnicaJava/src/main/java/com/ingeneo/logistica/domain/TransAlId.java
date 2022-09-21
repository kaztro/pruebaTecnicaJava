package com.ingeneo.logistica.domain;

import java.io.Serializable;
import java.util.Objects;

public class TransAlId implements Serializable {
	
	private Integer id_transporte;
	private Integer id_almacen;
	
	public TransAlId() {
	}

	public TransAlId(Integer id_transporte, Integer id_almacen) {
		this.id_transporte = id_transporte;
		this.id_almacen = id_almacen;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_almacen, id_transporte);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransAlId other = (TransAlId) obj;
		return Objects.equals(id_almacen, other.id_almacen) && Objects.equals(id_transporte, other.id_transporte);
	}
	
	
}
