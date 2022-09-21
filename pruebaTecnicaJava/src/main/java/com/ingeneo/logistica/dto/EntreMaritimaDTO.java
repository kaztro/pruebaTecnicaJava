package com.ingeneo.logistica.dto;

public class EntreMaritimaDTO {
	private String tipoProducto;
	private Integer cantProducto;
	private String fRegistro;
	private String fEntrega;
	private String puerto;
	private String precio;
	private String nFlota;
	private String nGuia;
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public Integer getCantProducto() {
		return cantProducto;
	}
	public void setCantProducto(Integer cantProducto) {
		this.cantProducto = cantProducto;
	}
	public String getfRegistro() {
		return fRegistro;
	}
	public void setfRegistro(String fRegistro) {
		this.fRegistro = fRegistro;
	}
	public String getfEntrega() {
		return fEntrega;
	}
	public void setfEntrega(String fEntrega) {
		this.fEntrega = fEntrega;
	}
	public String getPuerto() {
		return puerto;
	}
	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getnFlota() {
		return nFlota;
	}
	public void setnFlota(String nFlota) {
		this.nFlota = nFlota;
	}
	public String getnGuia() {
		return nGuia;
	}
	public void setnGuia(String nGuia) {
		this.nGuia = nGuia;
	}
}
